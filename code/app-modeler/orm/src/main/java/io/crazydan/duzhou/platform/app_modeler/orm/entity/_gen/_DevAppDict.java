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

import io.crazydan.duzhou.platform.app_modeler.orm.entity.DevAppDict;

// tell cpd to start ignoring code - CPD-OFF
/**
 *  字典定义: duzhou_dev_app_dict
 */
@SuppressWarnings({"PMD.UselessOverridingMethod","PMD.UnusedLocalVariable","java:S3008","java:S1602","java:S1128","java:S1161",
        "PMD.UnnecessaryFullyQualifiedName","PMD.EmptyControlStatement","java:S116","java:S115","java:S101","java:S3776"})
public class _DevAppDict extends DynamicOrmEntity{
    
    /* ID: ID VARCHAR */
    public static final String PROP_NAME_id = "id";
    public static final int PROP_ID_id = 1;
    
    /* 所属应用: APP_ID VARCHAR */
    public static final String PROP_NAME_appId = "appId";
    public static final int PROP_ID_appId = 2;
    
    /* 显示名称: DISPLAY_NAME VARCHAR */
    public static final String PROP_NAME_displayName = "displayName";
    public static final int PROP_ID_displayName = 3;
    
    /* 名称: NAME VARCHAR */
    public static final String PROP_NAME_name = "name";
    public static final int PROP_ID_name = 4;
    
    /* 字典项类型: OPTION_TYPE VARCHAR */
    public static final String PROP_NAME_optionType = "optionType";
    public static final int PROP_ID_optionType = 5;
    
    /* 字典项列表: OPTIONS VARCHAR */
    public static final String PROP_NAME_optionsJsonText = "optionsJsonText";
    public static final int PROP_ID_optionsJsonText = 6;
    

    private static int _PROP_ID_BOUND = 7;

    
    /* alias: optionsJsonTextComponent.data 字典项列表 */
    public static final String PROP_NAME_options = "options";
    
    /* component:  */
    public static final String PROP_NAME_optionsJsonTextComponent = "optionsJsonTextComponent";
    

    protected static final List<String> PK_PROP_NAMES = Arrays.asList(PROP_NAME_id);
    protected static final int[] PK_PROP_IDS = new int[]{PROP_ID_id};

    private static final String[] PROP_ID_TO_NAME = new String[7];
    private static final Map<String,Integer> PROP_NAME_TO_ID = new HashMap<>();
    static{
      
          PROP_ID_TO_NAME[PROP_ID_id] = PROP_NAME_id;
          PROP_NAME_TO_ID.put(PROP_NAME_id, PROP_ID_id);
      
          PROP_ID_TO_NAME[PROP_ID_appId] = PROP_NAME_appId;
          PROP_NAME_TO_ID.put(PROP_NAME_appId, PROP_ID_appId);
      
          PROP_ID_TO_NAME[PROP_ID_displayName] = PROP_NAME_displayName;
          PROP_NAME_TO_ID.put(PROP_NAME_displayName, PROP_ID_displayName);
      
          PROP_ID_TO_NAME[PROP_ID_name] = PROP_NAME_name;
          PROP_NAME_TO_ID.put(PROP_NAME_name, PROP_ID_name);
      
          PROP_ID_TO_NAME[PROP_ID_optionType] = PROP_NAME_optionType;
          PROP_NAME_TO_ID.put(PROP_NAME_optionType, PROP_ID_optionType);
      
          PROP_ID_TO_NAME[PROP_ID_optionsJsonText] = PROP_NAME_optionsJsonText;
          PROP_NAME_TO_ID.put(PROP_NAME_optionsJsonText, PROP_ID_optionsJsonText);
      
    }

    
    /* ID: ID */
    private java.lang.String _id;
    
    /* 所属应用: APP_ID */
    private java.lang.String _appId;
    
    /* 显示名称: DISPLAY_NAME */
    private java.lang.String _displayName;
    
    /* 名称: NAME */
    private java.lang.String _name;
    
    /* 字典项类型: OPTION_TYPE */
    private java.lang.String _optionType;
    
    /* 字典项列表: OPTIONS */
    private java.lang.String _optionsJsonText;
    

    public _DevAppDict(){
        // for debug
    }

    protected DevAppDict newInstance(){
       return new DevAppDict();
    }

    @Override
    public DevAppDict cloneInstance() {
        DevAppDict entity = newInstance();
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
      return "io.crazydan.duzhou.platform.app_modeler.orm.entity.DevAppDict";
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
        
            case PROP_ID_appId:
               return getAppId();
        
            case PROP_ID_displayName:
               return getDisplayName();
        
            case PROP_ID_name:
               return getName();
        
            case PROP_ID_optionType:
               return getOptionType();
        
            case PROP_ID_optionsJsonText:
               return getOptionsJsonText();
        
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
        
            case PROP_ID_name:{
               java.lang.String typedValue = null;
               if(value != null){
                   typedValue = ConvertHelper.toString(value,
                       err-> newTypeConversionError(PROP_NAME_name));
               }
               setName(typedValue);
               break;
            }
        
            case PROP_ID_optionType:{
               java.lang.String typedValue = null;
               if(value != null){
                   typedValue = ConvertHelper.toString(value,
                       err-> newTypeConversionError(PROP_NAME_optionType));
               }
               setOptionType(typedValue);
               break;
            }
        
            case PROP_ID_optionsJsonText:{
               java.lang.String typedValue = null;
               if(value != null){
                   typedValue = ConvertHelper.toString(value,
                       err-> newTypeConversionError(PROP_NAME_optionsJsonText));
               }
               setOptionsJsonText(typedValue);
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
        
            case PROP_ID_name:{
               onInitProp(propId);
               this._name = (java.lang.String)value;
               
               break;
            }
        
            case PROP_ID_optionType:{
               onInitProp(propId);
               this._optionType = (java.lang.String)value;
               
               break;
            }
        
            case PROP_ID_optionsJsonText:{
               onInitProp(propId);
               this._optionsJsonText = (java.lang.String)value;
               
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
     * 名称: NAME
     */
    public java.lang.String getName(){
         onPropGet(PROP_ID_name);
         return _name;
    }

    /**
     * 名称: NAME
     */
    public void setName(java.lang.String value){
        if(onPropSet(PROP_ID_name,value)){
            this._name = value;
            internalClearRefs(PROP_ID_name);
            
        }
    }
    
    /**
     * 字典项类型: OPTION_TYPE
     */
    public java.lang.String getOptionType(){
         onPropGet(PROP_ID_optionType);
         return _optionType;
    }

    /**
     * 字典项类型: OPTION_TYPE
     */
    public void setOptionType(java.lang.String value){
        if(onPropSet(PROP_ID_optionType,value)){
            this._optionType = value;
            internalClearRefs(PROP_ID_optionType);
            
        }
    }
    
    /**
     * 字典项列表: OPTIONS
     */
    public java.lang.String getOptionsJsonText(){
         onPropGet(PROP_ID_optionsJsonText);
         return _optionsJsonText;
    }

    /**
     * 字典项列表: OPTIONS
     */
    public void setOptionsJsonText(java.lang.String value){
        if(onPropSet(PROP_ID_optionsJsonText,value)){
            this._optionsJsonText = value;
            internalClearRefs(PROP_ID_optionsJsonText);
            
        }
    }
    
   public java.lang.Object getOptions(){
      return (java.lang.Object)internalGetAliasValue("optionsJsonTextComponent.data");
   }

   public void setOptions(java.lang.Object value){
      internalSetAliasValue("optionsJsonTextComponent.data",value);
   }

   private io.nop.orm.component.JsonOrmComponent _optionsJsonTextComponent;

   private static Map<String,Integer> COMPONENT_PROP_ID_MAP_optionsJsonTextComponent = new HashMap<>();
   static{
      
         COMPONENT_PROP_ID_MAP_optionsJsonTextComponent.put(io.nop.orm.component.JsonOrmComponent.PROP_NAME__jsonText,PROP_ID_optionsJsonText);
      
   }

   public io.nop.orm.component.JsonOrmComponent getOptionsJsonTextComponent(){
      if(_optionsJsonTextComponent == null){
          _optionsJsonTextComponent = new io.nop.orm.component.JsonOrmComponent();
          _optionsJsonTextComponent.bindToEntity(this, COMPONENT_PROP_ID_MAP_optionsJsonTextComponent);
      }
      return _optionsJsonTextComponent;
   }

}
// resume CPD analysis - CPD-ON