package io.crazydan.duzhou.platform.app_modeler.biz;

import java.util.List;
import javax.sql.DataSource;

import io.crazydan.duzhou.platform.app_modeler.biz._gen._DevAppModuleBizModel;
import io.crazydan.duzhou.platform.app_modeler.orm.entity.DevAppModule;
import io.nop.api.core.annotations.biz.BizModel;
import io.nop.core.resource.IResource;
import io.nop.dao.dialect.DialectManager;
import io.nop.dao.dialect.IDialect;
import io.nop.dbtool.core.DataBaseMeta;
import io.nop.dbtool.core.diff.OrmDbDiffer;
import io.nop.dbtool.core.discovery.jdbc.JdbcMetaDiscovery;
import io.nop.orm.model.OrmModel;
import io.nop.xlang.xdsl.DslModelHelper;
import jakarta.inject.Inject;

/** {@link DevAppModule} 的业务处理模型 */
@BizModel("DevAppModule")
public class DevAppModuleBizModel extends _DevAppModuleBizModel {
    @Inject
    protected DataSource dataSource;

    public List<OrmDbDiffer.ResultLine> genOrmDbDdl(IResource ormModelResource) {
        OrmModel newOrmModel = (OrmModel) DslModelHelper.loadDslModel(ormModelResource);

        JdbcMetaDiscovery discovery = new JdbcMetaDiscovery();
        String catalog = discovery.getCatalogs(this.dataSource).get(0);
        DataBaseMeta oldDbMeta = discovery.discover(this.dataSource, catalog, null, "DUZHOU_DEV_%");

        IDialect dialect = DialectManager.instance().getDialectForDataSource(this.dataSource);

        return OrmDbDiffer.forDialect(dialect.getName()).genDiffDdl(oldDbMeta, newOrmModel);
    }
}
