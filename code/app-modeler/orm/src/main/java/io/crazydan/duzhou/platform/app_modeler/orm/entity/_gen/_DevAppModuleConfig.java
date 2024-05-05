package io.crazydan.duzhou.platform.app_modeler.orm.entity._gen;

import io.nop.orm.model.IEntityModel;
import io.nop.orm.support.DynamicOrmEntity;
import io.nop.orm.support.OrmEntitySet; //NOPMD - suppressed UnusedImports - Auto Gen Code
import io.nop.orm.IOrmEntitySet; //NOPMD - suppressed UnusedImports - Auto Gen Code
import io.nop.api.core.convert.ConvertHelper;
import java.util.Map;
import java.util.HashMap;
import java.util.Arrays;
import java.util.List;

import io.crazydan.duzhou.platform.app_modeler.orm.entity.DevAppModuleConfig;

// tell cpd to start ignoring code - CPD-OFF
/**
 *  应用模块配置: duzhou_dev_app_module_config
 */
@SuppressWarnings({"PMD.UselessOverridingMethod","PMD.UnusedLocalVariable","java:S3008","java:S1602","java:S1128","java:S1161",
        "PMD.UnnecessaryFullyQualifiedName","PMD.EmptyControlStatement","java:S116","java:S115","java:S101","java:S3776"})
public class _DevAppModuleConfig extends DynamicOrmEntity{
    
    /* ID: ID VARCHAR */
    public static final String PROP_NAME_id = "id";
    public static final int PROP_ID_id = 1;
    
    /* 创建时间: CREATED_TIME TIMESTAMP */
    public static final String PROP_NAME_createdTime = "createdTime";
    public static final int PROP_ID_createdTime = 2;
    
    /* 更新时间: UPDATED_TIME TIMESTAMP */
    public static final String PROP_NAME_updatedTime = "updatedTime";
    public static final int PROP_ID_updatedTime = 3;
    
    /* 实体表名前缀: ENTITY_TABLE_NAME_PREFIX VARCHAR */
    public static final String PROP_NAME_entityTableNamePrefix = "entityTableNamePrefix";
    public static final int PROP_ID_entityTableNamePrefix = 4;
    
    /* Web 启动器类型: WEB_STARTER_TYPE VARCHAR */
    public static final String PROP_NAME_webStarterType = "webStarterType";
    public static final int PROP_ID_webStarterType = 5;
    
    /* 支持的数据库类型: DB_DIALECT VARCHAR */
    public static final String PROP_NAME_dbDialect = "dbDialect";
    public static final int PROP_ID_dbDialect = 6;
    

    private static int _PROP_ID_BOUND = 7;

    

    protected static final List<String> PK_PROP_NAMES = Arrays.asList(PROP_NAME_id);
    protected static final int[] PK_PROP_IDS = new int[]{PROP_ID_id};

    private static final String[] PROP_ID_TO_NAME = new String[7];
    private static final Map<String,Integer> PROP_NAME_TO_ID = new HashMap<>();
    static{
      
          PROP_ID_TO_NAME[PROP_ID_id] = PROP_NAME_id;
          PROP_NAME_TO_ID.put(PROP_NAME_id, PROP_ID_id);
      
          PROP_ID_TO_NAME[PROP_ID_createdTime] = PROP_NAME_createdTime;
          PROP_NAME_TO_ID.put(PROP_NAME_createdTime, PROP_ID_createdTime);
      
          PROP_ID_TO_NAME[PROP_ID_updatedTime] = PROP_NAME_updatedTime;
          PROP_NAME_TO_ID.put(PROP_NAME_updatedTime, PROP_ID_updatedTime);
      
          PROP_ID_TO_NAME[PROP_ID_entityTableNamePrefix] = PROP_NAME_entityTableNamePrefix;
          PROP_NAME_TO_ID.put(PROP_NAME_entityTableNamePrefix, PROP_ID_entityTableNamePrefix);
      
          PROP_ID_TO_NAME[PROP_ID_webStarterType] = PROP_NAME_webStarterType;
          PROP_NAME_TO_ID.put(PROP_NAME_webStarterType, PROP_ID_webStarterType);
      
          PROP_ID_TO_NAME[PROP_ID_dbDialect] = PROP_NAME_dbDialect;
          PROP_NAME_TO_ID.put(PROP_NAME_dbDialect, PROP_ID_dbDialect);
      
    }

    
    /* ID: ID */
    private java.lang.String _id;
    
    /* 创建时间: CREATED_TIME */
    private java.sql.Timestamp _createdTime;
    
    /* 更新时间: UPDATED_TIME */
    private java.sql.Timestamp _updatedTime;
    
    /* 实体表名前缀: ENTITY_TABLE_NAME_PREFIX */
    private java.lang.String _entityTableNamePrefix;
    
    /* Web 启动器类型: WEB_STARTER_TYPE */
    private java.lang.String _webStarterType;
    
    /* 支持的数据库类型: DB_DIALECT */
    private java.lang.String _dbDialect;
    

    public _DevAppModuleConfig(){
        // for debug
    }

    protected DevAppModuleConfig newInstance(){
       return new DevAppModuleConfig();
    }

    @Override
    public DevAppModuleConfig cloneInstance() {
        DevAppModuleConfig entity = newInstance();
        orm_forEachInitedProp((value, propId) -> {
            entity.onInitProp(propId);
        });
        return entity;
    }

    @Override
    public String orm_entityName() {
      // 如果存在实体模型对象，则以模型对象上的设置为准
      IEntityModel entityModel = orm_entityModel();
      if(entityModel != null)
          return entityModel.getName();
      return "io.crazydan.duzhou.platform.app_modeler.orm.entity.DevAppModuleConfig";
    }

    @Override
    public int orm_propIdBound(){
      IEntityModel entityModel = orm_entityModel();
      if(entityModel != null)
          return entityModel.getPropIdBound();
      return _PROP_ID_BOUND;
    }

    @Override
    public Object orm_id() {
    
        return buildSimpleId(PROP_ID_id);
     
    }

    @Override
    public boolean orm_isPrimary(int propId) {
        
            return propId == PROP_ID_id;
          
    }

    @Override
    public String orm_propName(int propId) {
        if(propId >= PROP_ID_TO_NAME.length)
            return super.orm_propName(propId);
        String propName = PROP_ID_TO_NAME[propId];
        if(propName == null)
           return super.orm_propName(propId);
        return propName;
    }

    @Override
    public int orm_propId(String propName) {
        Integer propId = PROP_NAME_TO_ID.get(propName);
        if(propId == null)
            return super.orm_propId(propName);
        return propId;
    }

    @Override
    public Object orm_propValue(int propId) {
        switch(propId){
        
            case PROP_ID_id:
               return getId();
        
            case PROP_ID_createdTime:
               return getCreatedTime();
        
            case PROP_ID_updatedTime:
               return getUpdatedTime();
        
            case PROP_ID_entityTableNamePrefix:
               return getEntityTableNamePrefix();
        
            case PROP_ID_webStarterType:
               return getWebStarterType();
        
            case PROP_ID_dbDialect:
               return getDbDialect();
        
           default:
              return super.orm_propValue(propId);
        }
    }

    

    @Override
    public void orm_propValue(int propId, Object value){
        switch(propId){
        
            case PROP_ID_id:{
               java.lang.String typedValue = null;
               if(value != null){
                   typedValue = ConvertHelper.toString(value,
                       err-> newTypeConversionError(PROP_NAME_id));
               }
               setId(typedValue);
               break;
            }
        
            case PROP_ID_createdTime:{
               java.sql.Timestamp typedValue = null;
               if(value != null){
                   typedValue = ConvertHelper.toTimestamp(value,
                       err-> newTypeConversionError(PROP_NAME_createdTime));
               }
               setCreatedTime(typedValue);
               break;
            }
        
            case PROP_ID_updatedTime:{
               java.sql.Timestamp typedValue = null;
               if(value != null){
                   typedValue = ConvertHelper.toTimestamp(value,
                       err-> newTypeConversionError(PROP_NAME_updatedTime));
               }
               setUpdatedTime(typedValue);
               break;
            }
        
            case PROP_ID_entityTableNamePrefix:{
               java.lang.String typedValue = null;
               if(value != null){
                   typedValue = ConvertHelper.toString(value,
                       err-> newTypeConversionError(PROP_NAME_entityTableNamePrefix));
               }
               setEntityTableNamePrefix(typedValue);
               break;
            }
        
            case PROP_ID_webStarterType:{
               java.lang.String typedValue = null;
               if(value != null){
                   typedValue = ConvertHelper.toString(value,
                       err-> newTypeConversionError(PROP_NAME_webStarterType));
               }
               setWebStarterType(typedValue);
               break;
            }
        
            case PROP_ID_dbDialect:{
               java.lang.String typedValue = null;
               if(value != null){
                   typedValue = ConvertHelper.toString(value,
                       err-> newTypeConversionError(PROP_NAME_dbDialect));
               }
               setDbDialect(typedValue);
               break;
            }
        
           default:
              super.orm_propValue(propId,value);
        }
    }

    @Override
    public void orm_internalSet(int propId, Object value) {
        switch(propId){
        
            case PROP_ID_id:{
               onInitProp(propId);
               this._id = (java.lang.String)value;
               orm_id(); // 如果是设置主键字段，则触发watcher
               break;
            }
        
            case PROP_ID_createdTime:{
               onInitProp(propId);
               this._createdTime = (java.sql.Timestamp)value;
               
               break;
            }
        
            case PROP_ID_updatedTime:{
               onInitProp(propId);
               this._updatedTime = (java.sql.Timestamp)value;
               
               break;
            }
        
            case PROP_ID_entityTableNamePrefix:{
               onInitProp(propId);
               this._entityTableNamePrefix = (java.lang.String)value;
               
               break;
            }
        
            case PROP_ID_webStarterType:{
               onInitProp(propId);
               this._webStarterType = (java.lang.String)value;
               
               break;
            }
        
            case PROP_ID_dbDialect:{
               onInitProp(propId);
               this._dbDialect = (java.lang.String)value;
               
               break;
            }
        
           default:
              super.orm_internalSet(propId,value);
        }
    }

    
    /**
     * ID: ID
     */
    public java.lang.String getId(){
         onPropGet(PROP_ID_id);
         return _id;
    }

    /**
     * ID: ID
     */
    public void setId(java.lang.String value){
        if(onPropSet(PROP_ID_id,value)){
            this._id = value;
            internalClearRefs(PROP_ID_id);
            orm_id();
        }
    }
    
    /**
     * 创建时间: CREATED_TIME
     */
    public java.sql.Timestamp getCreatedTime(){
         onPropGet(PROP_ID_createdTime);
         return _createdTime;
    }

    /**
     * 创建时间: CREATED_TIME
     */
    public void setCreatedTime(java.sql.Timestamp value){
        if(onPropSet(PROP_ID_createdTime,value)){
            this._createdTime = value;
            internalClearRefs(PROP_ID_createdTime);
            
        }
    }
    
    /**
     * 更新时间: UPDATED_TIME
     */
    public java.sql.Timestamp getUpdatedTime(){
         onPropGet(PROP_ID_updatedTime);
         return _updatedTime;
    }

    /**
     * 更新时间: UPDATED_TIME
     */
    public void setUpdatedTime(java.sql.Timestamp value){
        if(onPropSet(PROP_ID_updatedTime,value)){
            this._updatedTime = value;
            internalClearRefs(PROP_ID_updatedTime);
            
        }
    }
    
    /**
     * 实体表名前缀: ENTITY_TABLE_NAME_PREFIX
     */
    public java.lang.String getEntityTableNamePrefix(){
         onPropGet(PROP_ID_entityTableNamePrefix);
         return _entityTableNamePrefix;
    }

    /**
     * 实体表名前缀: ENTITY_TABLE_NAME_PREFIX
     */
    public void setEntityTableNamePrefix(java.lang.String value){
        if(onPropSet(PROP_ID_entityTableNamePrefix,value)){
            this._entityTableNamePrefix = value;
            internalClearRefs(PROP_ID_entityTableNamePrefix);
            
        }
    }
    
    /**
     * Web 启动器类型: WEB_STARTER_TYPE
     */
    public java.lang.String getWebStarterType(){
         onPropGet(PROP_ID_webStarterType);
         return _webStarterType;
    }

    /**
     * Web 启动器类型: WEB_STARTER_TYPE
     */
    public void setWebStarterType(java.lang.String value){
        if(onPropSet(PROP_ID_webStarterType,value)){
            this._webStarterType = value;
            internalClearRefs(PROP_ID_webStarterType);
            
        }
    }
    
    /**
     * 支持的数据库类型: DB_DIALECT
     */
    public java.lang.String getDbDialect(){
         onPropGet(PROP_ID_dbDialect);
         return _dbDialect;
    }

    /**
     * 支持的数据库类型: DB_DIALECT
     */
    public void setDbDialect(java.lang.String value){
        if(onPropSet(PROP_ID_dbDialect,value)){
            this._dbDialect = value;
            internalClearRefs(PROP_ID_dbDialect);
            
        }
    }
    
}
// resume CPD analysis - CPD-ON
