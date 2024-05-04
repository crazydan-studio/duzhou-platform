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

import io.crazydan.duzhou.platform.app_modeler.orm.entity.DevApp;

// tell cpd to start ignoring code - CPD-OFF
/**
 *  应用: duzhou_dev_app
 */
@SuppressWarnings({"PMD.UselessOverridingMethod","PMD.UnusedLocalVariable","java:S3008","java:S1602","java:S1128","java:S1161",
        "PMD.UnnecessaryFullyQualifiedName","PMD.EmptyControlStatement","java:S116","java:S115","java:S101","java:S3776"})
public class _DevApp extends DynamicOrmEntity{
    
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
    
    /* 显示名称: DISPLAY_NAME VARCHAR */
    public static final String PROP_NAME_displayName = "displayName";
    public static final int PROP_ID_displayName = 7;
    
    /* 版本号: VERSION VARCHAR */
    public static final String PROP_NAME_version = "version";
    public static final int PROP_ID_version = 9;
    
    /* 图片: LOGO VARCHAR */
    public static final String PROP_NAME_logo = "logo";
    public static final int PROP_ID_logo = 10;
    
    /* 说明: DESCRIPTION VARCHAR */
    public static final String PROP_NAME_description = "description";
    public static final int PROP_ID_description = 12;
    
    /* 许可协议: LICENSE VARCHAR */
    public static final String PROP_NAME_license = "license";
    public static final int PROP_ID_license = 13;
    
    /* 版权声明: COPYRIGHT VARCHAR */
    public static final String PROP_NAME_copyright = "copyright";
    public static final int PROP_ID_copyright = 14;
    
    /* 应用配置: CONFIG_ID VARCHAR */
    public static final String PROP_NAME_configId = "configId";
    public static final int PROP_ID_configId = 16;
    
    /* 一级编码: CODE1 VARCHAR */
    public static final String PROP_NAME_code1 = "code1";
    public static final int PROP_ID_code1 = 17;
    
    /* 二级编码: CODE2 VARCHAR */
    public static final String PROP_NAME_code2 = "code2";
    public static final int PROP_ID_code2 = 18;
    

    private static int _PROP_ID_BOUND = 19;

    
    /* relation: 应用配置 */
    public static final String PROP_NAME_config = "config";
    
    /* relation:  */
    public static final String PROP_NAME_dicts = "dicts";
    
    /* relation:  */
    public static final String PROP_NAME_domains = "domains";
    
    /* relation:  */
    public static final String PROP_NAME_modules = "modules";
    
    /* component:  */
    public static final String PROP_NAME_logoComponent = "logoComponent";
    

    protected static final List<String> PK_PROP_NAMES = Arrays.asList(PROP_NAME_id);
    protected static final int[] PK_PROP_IDS = new int[]{PROP_ID_id};

    private static final String[] PROP_ID_TO_NAME = new String[19];
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
      
          PROP_ID_TO_NAME[PROP_ID_displayName] = PROP_NAME_displayName;
          PROP_NAME_TO_ID.put(PROP_NAME_displayName, PROP_ID_displayName);
      
          PROP_ID_TO_NAME[PROP_ID_version] = PROP_NAME_version;
          PROP_NAME_TO_ID.put(PROP_NAME_version, PROP_ID_version);
      
          PROP_ID_TO_NAME[PROP_ID_logo] = PROP_NAME_logo;
          PROP_NAME_TO_ID.put(PROP_NAME_logo, PROP_ID_logo);
      
          PROP_ID_TO_NAME[PROP_ID_description] = PROP_NAME_description;
          PROP_NAME_TO_ID.put(PROP_NAME_description, PROP_ID_description);
      
          PROP_ID_TO_NAME[PROP_ID_license] = PROP_NAME_license;
          PROP_NAME_TO_ID.put(PROP_NAME_license, PROP_ID_license);
      
          PROP_ID_TO_NAME[PROP_ID_copyright] = PROP_NAME_copyright;
          PROP_NAME_TO_ID.put(PROP_NAME_copyright, PROP_ID_copyright);
      
          PROP_ID_TO_NAME[PROP_ID_configId] = PROP_NAME_configId;
          PROP_NAME_TO_ID.put(PROP_NAME_configId, PROP_ID_configId);
      
          PROP_ID_TO_NAME[PROP_ID_code1] = PROP_NAME_code1;
          PROP_NAME_TO_ID.put(PROP_NAME_code1, PROP_ID_code1);
      
          PROP_ID_TO_NAME[PROP_ID_code2] = PROP_NAME_code2;
          PROP_NAME_TO_ID.put(PROP_NAME_code2, PROP_ID_code2);
      
    }

    
    /* ID: ID */
    private java.lang.String _id;
    
    /* 创建时间: CREATED_TIME */
    private java.sql.Timestamp _createdTime;
    
    /* 更新时间: UPDATED_TIME */
    private java.sql.Timestamp _updatedTime;
    
    /* 数据版本: VER */
    private java.lang.Integer _ver;
    
    /* 显示名称: DISPLAY_NAME */
    private java.lang.String _displayName;
    
    /* 版本号: VERSION */
    private java.lang.String _version;
    
    /* 图片: LOGO */
    private java.lang.String _logo;
    
    /* 说明: DESCRIPTION */
    private java.lang.String _description;
    
    /* 许可协议: LICENSE */
    private java.lang.String _license;
    
    /* 版权声明: COPYRIGHT */
    private java.lang.String _copyright;
    
    /* 应用配置: CONFIG_ID */
    private java.lang.String _configId;
    
    /* 一级编码: CODE1 */
    private java.lang.String _code1;
    
    /* 二级编码: CODE2 */
    private java.lang.String _code2;
    

    public _DevApp(){
        // for debug
    }

    protected DevApp newInstance(){
       return new DevApp();
    }

    @Override
    public DevApp cloneInstance() {
        DevApp entity = newInstance();
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
      return "io.crazydan.duzhou.platform.app_modeler.orm.entity.DevApp";
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
        
            case PROP_ID_displayName:
               return getDisplayName();
        
            case PROP_ID_version:
               return getVersion();
        
            case PROP_ID_logo:
               return getLogo();
        
            case PROP_ID_description:
               return getDescription();
        
            case PROP_ID_license:
               return getLicense();
        
            case PROP_ID_copyright:
               return getCopyright();
        
            case PROP_ID_configId:
               return getConfigId();
        
            case PROP_ID_code1:
               return getCode1();
        
            case PROP_ID_code2:
               return getCode2();
        
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
        
            case PROP_ID_displayName:{
               java.lang.String typedValue = null;
               if(value != null){
                   typedValue = ConvertHelper.toString(value,
                       err-> newTypeConversionError(PROP_NAME_displayName));
               }
               setDisplayName(typedValue);
               break;
            }
        
            case PROP_ID_version:{
               java.lang.String typedValue = null;
               if(value != null){
                   typedValue = ConvertHelper.toString(value,
                       err-> newTypeConversionError(PROP_NAME_version));
               }
               setVersion(typedValue);
               break;
            }
        
            case PROP_ID_logo:{
               java.lang.String typedValue = null;
               if(value != null){
                   typedValue = ConvertHelper.toString(value,
                       err-> newTypeConversionError(PROP_NAME_logo));
               }
               setLogo(typedValue);
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
        
            case PROP_ID_license:{
               java.lang.String typedValue = null;
               if(value != null){
                   typedValue = ConvertHelper.toString(value,
                       err-> newTypeConversionError(PROP_NAME_license));
               }
               setLicense(typedValue);
               break;
            }
        
            case PROP_ID_copyright:{
               java.lang.String typedValue = null;
               if(value != null){
                   typedValue = ConvertHelper.toString(value,
                       err-> newTypeConversionError(PROP_NAME_copyright));
               }
               setCopyright(typedValue);
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
        
            case PROP_ID_code1:{
               java.lang.String typedValue = null;
               if(value != null){
                   typedValue = ConvertHelper.toString(value,
                       err-> newTypeConversionError(PROP_NAME_code1));
               }
               setCode1(typedValue);
               break;
            }
        
            case PROP_ID_code2:{
               java.lang.String typedValue = null;
               if(value != null){
                   typedValue = ConvertHelper.toString(value,
                       err-> newTypeConversionError(PROP_NAME_code2));
               }
               setCode2(typedValue);
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
        
            case PROP_ID_displayName:{
               onInitProp(propId);
               this._displayName = (java.lang.String)value;
               
               break;
            }
        
            case PROP_ID_version:{
               onInitProp(propId);
               this._version = (java.lang.String)value;
               
               break;
            }
        
            case PROP_ID_logo:{
               onInitProp(propId);
               this._logo = (java.lang.String)value;
               
               break;
            }
        
            case PROP_ID_description:{
               onInitProp(propId);
               this._description = (java.lang.String)value;
               
               break;
            }
        
            case PROP_ID_license:{
               onInitProp(propId);
               this._license = (java.lang.String)value;
               
               break;
            }
        
            case PROP_ID_copyright:{
               onInitProp(propId);
               this._copyright = (java.lang.String)value;
               
               break;
            }
        
            case PROP_ID_configId:{
               onInitProp(propId);
               this._configId = (java.lang.String)value;
               
               break;
            }
        
            case PROP_ID_code1:{
               onInitProp(propId);
               this._code1 = (java.lang.String)value;
               
               break;
            }
        
            case PROP_ID_code2:{
               onInitProp(propId);
               this._code2 = (java.lang.String)value;
               
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
     * 版本号: VERSION
     */
    public java.lang.String getVersion(){
         onPropGet(PROP_ID_version);
         return _version;
    }

    /**
     * 版本号: VERSION
     */
    public void setVersion(java.lang.String value){
        if(onPropSet(PROP_ID_version,value)){
            this._version = value;
            internalClearRefs(PROP_ID_version);
            
        }
    }
    
    /**
     * 图片: LOGO
     */
    public java.lang.String getLogo(){
         onPropGet(PROP_ID_logo);
         return _logo;
    }

    /**
     * 图片: LOGO
     */
    public void setLogo(java.lang.String value){
        if(onPropSet(PROP_ID_logo,value)){
            this._logo = value;
            internalClearRefs(PROP_ID_logo);
            
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
     * 许可协议: LICENSE
     */
    public java.lang.String getLicense(){
         onPropGet(PROP_ID_license);
         return _license;
    }

    /**
     * 许可协议: LICENSE
     */
    public void setLicense(java.lang.String value){
        if(onPropSet(PROP_ID_license,value)){
            this._license = value;
            internalClearRefs(PROP_ID_license);
            
        }
    }
    
    /**
     * 版权声明: COPYRIGHT
     */
    public java.lang.String getCopyright(){
         onPropGet(PROP_ID_copyright);
         return _copyright;
    }

    /**
     * 版权声明: COPYRIGHT
     */
    public void setCopyright(java.lang.String value){
        if(onPropSet(PROP_ID_copyright,value)){
            this._copyright = value;
            internalClearRefs(PROP_ID_copyright);
            
        }
    }
    
    /**
     * 应用配置: CONFIG_ID
     */
    public java.lang.String getConfigId(){
         onPropGet(PROP_ID_configId);
         return _configId;
    }

    /**
     * 应用配置: CONFIG_ID
     */
    public void setConfigId(java.lang.String value){
        if(onPropSet(PROP_ID_configId,value)){
            this._configId = value;
            internalClearRefs(PROP_ID_configId);
            
        }
    }
    
    /**
     * 一级编码: CODE1
     */
    public java.lang.String getCode1(){
         onPropGet(PROP_ID_code1);
         return _code1;
    }

    /**
     * 一级编码: CODE1
     */
    public void setCode1(java.lang.String value){
        if(onPropSet(PROP_ID_code1,value)){
            this._code1 = value;
            internalClearRefs(PROP_ID_code1);
            
        }
    }
    
    /**
     * 二级编码: CODE2
     */
    public java.lang.String getCode2(){
         onPropGet(PROP_ID_code2);
         return _code2;
    }

    /**
     * 二级编码: CODE2
     */
    public void setCode2(java.lang.String value){
        if(onPropSet(PROP_ID_code2,value)){
            this._code2 = value;
            internalClearRefs(PROP_ID_code2);
            
        }
    }
    
    /**
     * 应用配置
     */
    public io.crazydan.duzhou.platform.app_modeler.orm.entity.DevAppConfig getConfig(){
       return (io.crazydan.duzhou.platform.app_modeler.orm.entity.DevAppConfig)internalGetRefEntity(PROP_NAME_config);
    }

    public void setConfig(io.crazydan.duzhou.platform.app_modeler.orm.entity.DevAppConfig refEntity){
   
           if(refEntity == null){
           
                   this.setConfigId(null);
               
           }else{
           internalSetRefEntity(PROP_NAME_config, refEntity,()->{
           
                           this.setConfigId(refEntity.getId());
                       
           });
           }
       
    }
       
    private final OrmEntitySet<io.crazydan.duzhou.platform.app_modeler.orm.entity.DevAppDict> _dicts = new OrmEntitySet<>(this, PROP_NAME_dicts,
        io.crazydan.duzhou.platform.app_modeler.orm.entity.DevAppDict.PROP_NAME_app, null,io.crazydan.duzhou.platform.app_modeler.orm.entity.DevAppDict.class);

    /**
     * 。 refPropName: app, keyProp: {rel.keyProp}
     */
    public IOrmEntitySet<io.crazydan.duzhou.platform.app_modeler.orm.entity.DevAppDict> getDicts(){
       return _dicts;
    }
       
    private final OrmEntitySet<io.crazydan.duzhou.platform.app_modeler.orm.entity.DevAppDomain> _domains = new OrmEntitySet<>(this, PROP_NAME_domains,
        io.crazydan.duzhou.platform.app_modeler.orm.entity.DevAppDomain.PROP_NAME_app, null,io.crazydan.duzhou.platform.app_modeler.orm.entity.DevAppDomain.class);

    /**
     * 。 refPropName: app, keyProp: {rel.keyProp}
     */
    public IOrmEntitySet<io.crazydan.duzhou.platform.app_modeler.orm.entity.DevAppDomain> getDomains(){
       return _domains;
    }
       
    private final OrmEntitySet<io.crazydan.duzhou.platform.app_modeler.orm.entity.DevAppModule> _modules = new OrmEntitySet<>(this, PROP_NAME_modules,
        io.crazydan.duzhou.platform.app_modeler.orm.entity.DevAppModule.PROP_NAME_app, null,io.crazydan.duzhou.platform.app_modeler.orm.entity.DevAppModule.class);

    /**
     * 。 refPropName: app, keyProp: {rel.keyProp}
     */
    public IOrmEntitySet<io.crazydan.duzhou.platform.app_modeler.orm.entity.DevAppModule> getModules(){
       return _modules;
    }
       
   private io.nop.orm.component.OrmFileComponent _logoComponent;

   private static Map<String,Integer> COMPONENT_PROP_ID_MAP_logoComponent = new HashMap<>();
   static{
      
         COMPONENT_PROP_ID_MAP_logoComponent.put(io.nop.orm.component.OrmFileComponent.PROP_NAME_filePath,PROP_ID_logo);
      
   }

   public io.nop.orm.component.OrmFileComponent getLogoComponent(){
      if(_logoComponent == null){
          _logoComponent = new io.nop.orm.component.OrmFileComponent();
          _logoComponent.bindToEntity(this, COMPONENT_PROP_ID_MAP_logoComponent);
      }
      return _logoComponent;
   }

}
// resume CPD analysis - CPD-ON
