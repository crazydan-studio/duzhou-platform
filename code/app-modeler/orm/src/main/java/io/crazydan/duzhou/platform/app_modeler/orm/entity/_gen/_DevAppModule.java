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

import io.crazydan.duzhou.platform.app_modeler.orm.entity.DevAppModule;

// tell cpd to start ignoring code - CPD-OFF
/**
 *  应用模块: duzhou_dev_app_module
 */
@SuppressWarnings({"PMD.UselessOverridingMethod","PMD.UnusedLocalVariable","java:S3008","java:S1602","java:S1128","java:S1161",
        "PMD.UnnecessaryFullyQualifiedName","PMD.EmptyControlStatement","java:S116","java:S115","java:S101","java:S3776"})
public class _DevAppModule extends DynamicOrmEntity{
    
    /* ID: ID VARCHAR */
    public static final String PROP_NAME_id = "id";
    public static final int PROP_ID_id = 1;
    
    /* 创建时间: CREATED_TIME TIMESTAMP */
    public static final String PROP_NAME_createdTime = "createdTime";
    public static final int PROP_ID_createdTime = 3;
    
    /* 更新时间: UPDATED_TIME TIMESTAMP */
    public static final String PROP_NAME_updatedTime = "updatedTime";
    public static final int PROP_ID_updatedTime = 5;
    
    /* 数据版本: VER INTEGER */
    public static final String PROP_NAME_ver = "ver";
    public static final int PROP_ID_ver = 6;
    
    /* 所属应用: APP_ID VARCHAR */
    public static final String PROP_NAME_appId = "appId";
    public static final int PROP_ID_appId = 7;
    
    /* 显示名称: DISPLAY_NAME VARCHAR */
    public static final String PROP_NAME_displayName = "displayName";
    public static final int PROP_ID_displayName = 8;
    
    /* 编码: CODE VARCHAR */
    public static final String PROP_NAME_code = "code";
    public static final int PROP_ID_code = 9;
    
    /* 说明: DESCRIPTION VARCHAR */
    public static final String PROP_NAME_description = "description";
    public static final int PROP_ID_description = 10;
    
    /* 模块配置: CONFIG_ID VARCHAR */
    public static final String PROP_NAME_configId = "configId";
    public static final int PROP_ID_configId = 13;
    

    private static int _PROP_ID_BOUND = 14;

    
    /* relation:  */
    public static final String PROP_NAME_app = "app";
    
    /* relation: 模块配置 */
    public static final String PROP_NAME_config = "config";
    
    /* relation:  */
    public static final String PROP_NAME_entities = "entities";
    

    protected static final List<String> PK_PROP_NAMES = Arrays.asList(PROP_NAME_id);
    protected static final int[] PK_PROP_IDS = new int[]{PROP_ID_id};

    private static final String[] PROP_ID_TO_NAME = new String[14];
    private static final Map<String,Integer> PROP_NAME_TO_ID = new HashMap<>();
    static{
      
          PROP_ID_TO_NAME[PROP_ID_id] = PROP_NAME_id;
          PROP_NAME_TO_ID.put(PROP_NAME_id, PROP_ID_id);
      
          PROP_ID_TO_NAME[PROP_ID_createdTime] = PROP_NAME_createdTime;
          PROP_NAME_TO_ID.put(PROP_NAME_createdTime, PROP_ID_createdTime);
      
          PROP_ID_TO_NAME[PROP_ID_updatedTime] = PROP_NAME_updatedTime;
          PROP_NAME_TO_ID.put(PROP_NAME_updatedTime, PROP_ID_updatedTime);
      
          PROP_ID_TO_NAME[PROP_ID_ver] = PROP_NAME_ver;
          PROP_NAME_TO_ID.put(PROP_NAME_ver, PROP_ID_ver);
      
          PROP_ID_TO_NAME[PROP_ID_appId] = PROP_NAME_appId;
          PROP_NAME_TO_ID.put(PROP_NAME_appId, PROP_ID_appId);
      
          PROP_ID_TO_NAME[PROP_ID_displayName] = PROP_NAME_displayName;
          PROP_NAME_TO_ID.put(PROP_NAME_displayName, PROP_ID_displayName);
      
          PROP_ID_TO_NAME[PROP_ID_code] = PROP_NAME_code;
          PROP_NAME_TO_ID.put(PROP_NAME_code, PROP_ID_code);
      
          PROP_ID_TO_NAME[PROP_ID_description] = PROP_NAME_description;
          PROP_NAME_TO_ID.put(PROP_NAME_description, PROP_ID_description);
      
          PROP_ID_TO_NAME[PROP_ID_configId] = PROP_NAME_configId;
          PROP_NAME_TO_ID.put(PROP_NAME_configId, PROP_ID_configId);
      
    }

    
    /* ID: ID */
    private java.lang.String _id;
    
    /* 创建时间: CREATED_TIME */
    private java.sql.Timestamp _createdTime;
    
    /* 更新时间: UPDATED_TIME */
    private java.sql.Timestamp _updatedTime;
    
    /* 数据版本: VER */
    private java.lang.Integer _ver;
    
    /* 所属应用: APP_ID */
    private java.lang.String _appId;
    
    /* 显示名称: DISPLAY_NAME */
    private java.lang.String _displayName;
    
    /* 编码: CODE */
    private java.lang.String _code;
    
    /* 说明: DESCRIPTION */
    private java.lang.String _description;
    
    /* 模块配置: CONFIG_ID */
    private java.lang.String _configId;
    

    public _DevAppModule(){
        // for debug
    }

    protected DevAppModule newInstance(){
        DevAppModule entity = new DevAppModule();
        entity.orm_attach(orm_enhancer());
        entity.orm_entityModel(orm_entityModel());
        return entity;
    }

    @Override
    public DevAppModule cloneInstance() {
        DevAppModule entity = newInstance();
        orm_forEachInitedProp((value, propId) -> {
            entity.orm_propValue(propId,value);
        });
        return entity;
    }

    @Override
    public String orm_entityName() {
      // 如果存在实体模型对象，则以模型对象上的设置为准
      IEntityModel entityModel = orm_entityModel();
      if(entityModel != null)
          return entityModel.getName();
      return "io.crazydan.duzhou.platform.app_modeler.orm.entity.DevAppModule";
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
        
            case PROP_ID_ver:
               return getVer();
        
            case PROP_ID_appId:
               return getAppId();
        
            case PROP_ID_displayName:
               return getDisplayName();
        
            case PROP_ID_code:
               return getCode();
        
            case PROP_ID_description:
               return getDescription();
        
            case PROP_ID_configId:
               return getConfigId();
        
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
        
            case PROP_ID_ver:{
               java.lang.Integer typedValue = null;
               if(value != null){
                   typedValue = ConvertHelper.toInteger(value,
                       err-> newTypeConversionError(PROP_NAME_ver));
               }
               setVer(typedValue);
               break;
            }
        
            case PROP_ID_appId:{
               java.lang.String typedValue = null;
               if(value != null){
                   typedValue = ConvertHelper.toString(value,
                       err-> newTypeConversionError(PROP_NAME_appId));
               }
               setAppId(typedValue);
               break;
            }
        
            case PROP_ID_displayName:{
               java.lang.String typedValue = null;
               if(value != null){
                   typedValue = ConvertHelper.toString(value,
                       err-> newTypeConversionError(PROP_NAME_displayName));
               }
               setDisplayName(typedValue);
               break;
            }
        
            case PROP_ID_code:{
               java.lang.String typedValue = null;
               if(value != null){
                   typedValue = ConvertHelper.toString(value,
                       err-> newTypeConversionError(PROP_NAME_code));
               }
               setCode(typedValue);
               break;
            }
        
            case PROP_ID_description:{
               java.lang.String typedValue = null;
               if(value != null){
                   typedValue = ConvertHelper.toString(value,
                       err-> newTypeConversionError(PROP_NAME_description));
               }
               setDescription(typedValue);
               break;
            }
        
            case PROP_ID_configId:{
               java.lang.String typedValue = null;
               if(value != null){
                   typedValue = ConvertHelper.toString(value,
                       err-> newTypeConversionError(PROP_NAME_configId));
               }
               setConfigId(typedValue);
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
        
            case PROP_ID_ver:{
               onInitProp(propId);
               this._ver = (java.lang.Integer)value;
               
               break;
            }
        
            case PROP_ID_appId:{
               onInitProp(propId);
               this._appId = (java.lang.String)value;
               
               break;
            }
        
            case PROP_ID_displayName:{
               onInitProp(propId);
               this._displayName = (java.lang.String)value;
               
               break;
            }
        
            case PROP_ID_code:{
               onInitProp(propId);
               this._code = (java.lang.String)value;
               
               break;
            }
        
            case PROP_ID_description:{
               onInitProp(propId);
               this._description = (java.lang.String)value;
               
               break;
            }
        
            case PROP_ID_configId:{
               onInitProp(propId);
               this._configId = (java.lang.String)value;
               
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
     * 数据版本: VER
     */
    public java.lang.Integer getVer(){
         onPropGet(PROP_ID_ver);
         return _ver;
    }

    /**
     * 数据版本: VER
     */
    public void setVer(java.lang.Integer value){
        if(onPropSet(PROP_ID_ver,value)){
            this._ver = value;
            internalClearRefs(PROP_ID_ver);
            
        }
    }
    
    /**
     * 所属应用: APP_ID
     */
    public java.lang.String getAppId(){
         onPropGet(PROP_ID_appId);
         return _appId;
    }

    /**
     * 所属应用: APP_ID
     */
    public void setAppId(java.lang.String value){
        if(onPropSet(PROP_ID_appId,value)){
            this._appId = value;
            internalClearRefs(PROP_ID_appId);
            
        }
    }
    
    /**
     * 显示名称: DISPLAY_NAME
     */
    public java.lang.String getDisplayName(){
         onPropGet(PROP_ID_displayName);
         return _displayName;
    }

    /**
     * 显示名称: DISPLAY_NAME
     */
    public void setDisplayName(java.lang.String value){
        if(onPropSet(PROP_ID_displayName,value)){
            this._displayName = value;
            internalClearRefs(PROP_ID_displayName);
            
        }
    }
    
    /**
     * 编码: CODE
     */
    public java.lang.String getCode(){
         onPropGet(PROP_ID_code);
         return _code;
    }

    /**
     * 编码: CODE
     */
    public void setCode(java.lang.String value){
        if(onPropSet(PROP_ID_code,value)){
            this._code = value;
            internalClearRefs(PROP_ID_code);
            
        }
    }
    
    /**
     * 说明: DESCRIPTION
     */
    public java.lang.String getDescription(){
         onPropGet(PROP_ID_description);
         return _description;
    }

    /**
     * 说明: DESCRIPTION
     */
    public void setDescription(java.lang.String value){
        if(onPropSet(PROP_ID_description,value)){
            this._description = value;
            internalClearRefs(PROP_ID_description);
            
        }
    }
    
    /**
     * 模块配置: CONFIG_ID
     */
    public java.lang.String getConfigId(){
         onPropGet(PROP_ID_configId);
         return _configId;
    }

    /**
     * 模块配置: CONFIG_ID
     */
    public void setConfigId(java.lang.String value){
        if(onPropSet(PROP_ID_configId,value)){
            this._configId = value;
            internalClearRefs(PROP_ID_configId);
            
        }
    }
    
    /**
     * 
     */
    public io.crazydan.duzhou.platform.app_modeler.orm.entity.DevApp getApp(){
       return (io.crazydan.duzhou.platform.app_modeler.orm.entity.DevApp)internalGetRefEntity(PROP_NAME_app);
    }

    public void setApp(io.crazydan.duzhou.platform.app_modeler.orm.entity.DevApp refEntity){
   
           if(refEntity == null){
           
                   this.setAppId(null);
               
           }else{
           internalSetRefEntity(PROP_NAME_app, refEntity,()->{
           
                           this.setAppId(refEntity.getId());
                       
           });
           }
       
    }
       
    /**
     * 模块配置
     */
    public io.crazydan.duzhou.platform.app_modeler.orm.entity.DevAppModuleConfig getConfig(){
       return (io.crazydan.duzhou.platform.app_modeler.orm.entity.DevAppModuleConfig)internalGetRefEntity(PROP_NAME_config);
    }

    public void setConfig(io.crazydan.duzhou.platform.app_modeler.orm.entity.DevAppModuleConfig refEntity){
   
           if(refEntity == null){
           
                   this.setConfigId(null);
               
           }else{
           internalSetRefEntity(PROP_NAME_config, refEntity,()->{
           
                           this.setConfigId(refEntity.getId());
                       
           });
           }
       
    }
       
    private final OrmEntitySet<io.crazydan.duzhou.platform.app_modeler.orm.entity.DevAppEntity> _entities = new OrmEntitySet<>(this, PROP_NAME_entities,
        io.crazydan.duzhou.platform.app_modeler.orm.entity.DevAppEntity.PROP_NAME_module, null,io.crazydan.duzhou.platform.app_modeler.orm.entity.DevAppEntity.class);

    /**
     * 。 refPropName: module, keyProp: {rel.keyProp}
     */
    public IOrmEntitySet<io.crazydan.duzhou.platform.app_modeler.orm.entity.DevAppEntity> getEntities(){
       return _entities;
    }
       
}
// resume CPD analysis - CPD-ON
