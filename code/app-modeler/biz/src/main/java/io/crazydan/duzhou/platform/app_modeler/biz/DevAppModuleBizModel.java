package io.crazydan.duzhou.platform.app_modeler.biz;

import java.util.ArrayList;
import java.util.List;
import javax.sql.DataSource;

import io.crazydan.duzhou.platform.app_modeler.biz._gen._DevAppModuleBizModel;
import io.crazydan.duzhou.platform.app_modeler.orm.entity.DevAppModule;
import io.nop.api.core.annotations.biz.BizModel;
import io.nop.api.core.beans.ApiResponse;
import io.nop.core.lang.sql.SQL;
import io.nop.core.resource.IResource;
import io.nop.dao.dialect.DialectManager;
import io.nop.dao.dialect.IDialect;
import io.nop.dbtool.core.DataBaseMeta;
import io.nop.dbtool.core.diff.OrmDbDiffer;
import io.nop.dbtool.core.discovery.jdbc.JdbcMetaDiscovery;
import io.nop.orm.model.OrmModel;
import io.nop.xlang.xdsl.DslModelHelper;
import jakarta.inject.Inject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/** {@link DevAppModule} 的业务处理模型 */
@BizModel("DevAppModule")
public class DevAppModuleBizModel extends _DevAppModuleBizModel {
    private static final Logger log = LoggerFactory.getLogger(DevAppModuleBizModel.class);

    @Inject
    protected DataSource dataSource;

    public List<OrmDbDiffer.DiffDdl> genOrmDbDdl(IResource ormModelResource) {
        OrmModel newOrmModel = (OrmModel) DslModelHelper.loadDslModel(ormModelResource);

        JdbcMetaDiscovery discovery = JdbcMetaDiscovery.forDataSource(this.dataSource);
        DataBaseMeta oldDbMeta = discovery.discover(null, null, "DUZHOU_DEV_%");

        IDialect dialect = DialectManager.instance().getDialectForDataSource(this.dataSource);

        return OrmDbDiffer.forDialect(dialect.getName()).genDiffDdl(oldDbMeta, newOrmModel);
    }

    public ApiResponse<List<String>> executeDdlList(List<String> ddlList) {
        List<String> executedDdlList = new ArrayList<>(ddlList.size());

        ApiResponse<List<String>> resp = ApiResponse.buildSuccess(executedDdlList);
        for (String ddl : ddlList) {
            SQL sql = SQL.begin().sql(ddl).end();

            try {
                orm().getSessionFactory().getJdbcTemplate().executeUpdate(sql);

                executedDdlList.add(ddl);
            } catch (Exception e) {
                log.warn("duzhou.biz.dev-app-module.execute-ddl.failed", e);
                resp.setMsg(e.getMessage());
                break;
            }
        }
        return resp;
    }
}
