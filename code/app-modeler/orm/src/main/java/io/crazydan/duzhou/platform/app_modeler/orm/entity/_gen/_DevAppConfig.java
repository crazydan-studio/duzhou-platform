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

import io.crazydan.duzhou.platform.app_modeler.orm.entity.DevAppConfig;

// tell cpd to start ignoring code - CPD-OFF
/**
 *  应用配置: duzhou_dev_app_config
 */
@SuppressWarnings({"PMD.UselessOverridingMethod","PMD.UnusedLocalVariable","java:S3008","java:S1602","java:S1128","java:S1161",
        "PMD.UnnecessaryFullyQualifiedName","PMD.EmptyControlStatement","java:S116","java:S115","java:S101","java:S3776"})
public class _DevAppConfig extends DynamicOrmEntity{
    
    /* ID: ID VARCHAR */
    public static final String PROP_NAME_id = "id";
    public static final int PROP_ID_id = 1;
    
    /* 创建时间: CREATED_TIME TIMESTAMP */
    public static final String PROP_NAME_createdTime = "createdTime";
    public static final int PROP_ID_createdTime = 2;
    
    /* 更新时间: UPDATED_TIME TIMESTAMP */
    public static final String PROP_NAME_updatedTime = "updatedTime";
    public static final int PROP_ID_updatedTime = 3;
    
    /* Java 基础包名: BASE_CLASS_PACKAGE_NAME VARCHAR */
    public static final String PROP_NAME_baseClassPackageName = "baseClassPackageName";
    public static final int PROP_ID_baseClassPackageName = 5;
    
    /* Maven 配置: MAVEN VARCHAR */
    public static final String PROP_NAME_mavenJsonText = "mavenJsonText";
    public static final int PROP_ID_mavenJsonText = 6;
    

    private static int _PROP_ID_BOUND = 7;

    
    /* alias: mavenJsonTextComponent.data Maven 配置 */
    public static final String PROP_NAME_maven = "maven";
    
    /* component:  */
    public static final String PROP_NAME_mavenJsonTextComponent = "mavenJsonTextComponent";
    

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
      
          PROP_ID_TO_NAME[PROP_ID_baseClassPackageName] = PROP_NAME_baseClassPackageName;
          PROP_NAME_TO_ID.put(PROP_NAME_baseClassPackageName, PROP_ID_baseClassPackageName);
      
          PROP_ID_TO_NAME[PROP_ID_mavenJsonText] = PROP_NAME_mavenJsonText;
          PROP_NAME_TO_ID.put(PROP_NAME_mavenJsonText, PROP_ID_mavenJsonText);
      
    }

    
    /* ID: ID */
    private java.lang.String _id;
    
    /* 创建时间: CREATED_TIME */
    private java.sql.Timestamp _createdTime;
    
    /* 更新时间: UPDATED_TIME */
    private java.sql.Timestamp _updatedTime;
    
    /* Java 基础包名: BASE_CLASS_PACKAGE_NAME */
    private java.lang.String _baseClassPackageName;
    
    /* Maven 配置: MAVEN */
    private java.lang.String _mavenJsonText;
    

    public _DevAppConfig(){
        // for debug
    }

    protected DevAppConfig newInstance(){
        DevAppConfig entity = new DevAppConfig();
        entity.orm_attach(orm_enhancer());
        entity.orm_entityModel(orm_entityModel());
        return entity;
    }

    @Override
    public DevAppConfig cloneInstance() {
        DevAppConfig entity = newInstance();
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
      return "io.crazydan.duzhou.platform.app_modeler.orm.entity.DevAppConfig";
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
        
            case PROP_ID_baseClassPackageName:
               return getBaseClassPackageName();
        
            case PROP_ID_mavenJsonText:
               return getMavenJsonText();
        
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
        
            case PROP_ID_baseClassPackageName:{
               java.lang.String typedValue = null;
               if(value != null){
                   typedValue = ConvertHelper.toString(value,
                       err-> newTypeConversionError(PROP_NAME_baseClassPackageName));
               }
               setBaseClassPackageName(typedValue);
               break;
            }
        
            case PROP_ID_mavenJsonText:{
               java.lang.String typedValue = null;
               if(value != null){
                   typedValue = ConvertHelper.toString(value,
                       err-> newTypeConversionError(PROP_NAME_mavenJsonText));
               }
               setMavenJsonText(typedValue);
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
        
            case PROP_ID_baseClassPackageName:{
               onInitProp(propId);
               this._baseClassPackageName = (java.lang.String)value;
               
               break;
            }
        
            case PROP_ID_mavenJsonText:{
               onInitProp(propId);
               this._mavenJsonText = (java.lang.String)value;
               
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
     * Java 基础包名: BASE_CLASS_PACKAGE_NAME
     */
    public java.lang.String getBaseClassPackageName(){
         onPropGet(PROP_ID_baseClassPackageName);
         return _baseClassPackageName;
    }

    /**
     * Java 基础包名: BASE_CLASS_PACKAGE_NAME
     */
    public void setBaseClassPackageName(java.lang.String value){
        if(onPropSet(PROP_ID_baseClassPackageName,value)){
            this._baseClassPackageName = value;
            internalClearRefs(PROP_ID_baseClassPackageName);
            
        }
    }
    
    /**
     * Maven 配置: MAVEN
     */
    public java.lang.String getMavenJsonText(){
         onPropGet(PROP_ID_mavenJsonText);
         return _mavenJsonText;
    }

    /**
     * Maven 配置: MAVEN
     */
    public void setMavenJsonText(java.lang.String value){
        if(onPropSet(PROP_ID_mavenJsonText,value)){
            this._mavenJsonText = value;
            internalClearRefs(PROP_ID_mavenJsonText);
            
        }
    }
    
   public java.lang.Object getMaven(){
      return (java.lang.Object)internalGetAliasValue("mavenJsonTextComponent.data");
   }

   public void setMaven(java.lang.Object value){
      internalSetAliasValue("mavenJsonTextComponent.data",value);
   }

   private io.nop.orm.component.JsonOrmComponent _mavenJsonTextComponent;

   private static Map<String,Integer> COMPONENT_PROP_ID_MAP_mavenJsonTextComponent = new HashMap<>();
   static{
      
         COMPONENT_PROP_ID_MAP_mavenJsonTextComponent.put(io.nop.orm.component.JsonOrmComponent.PROP_NAME__jsonText,PROP_ID_mavenJsonText);
      
   }

   public io.nop.orm.component.JsonOrmComponent getMavenJsonTextComponent(){
      if(_mavenJsonTextComponent == null){
          _mavenJsonTextComponent = new io.nop.orm.component.JsonOrmComponent();
          _mavenJsonTextComponent.bindToEntity(this, COMPONENT_PROP_ID_MAP_mavenJsonTextComponent);
      }
      return _mavenJsonTextComponent;
   }

}
// resume CPD analysis - CPD-ON
