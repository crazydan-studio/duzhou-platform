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

import io.crazydan.duzhou.platform.app_modeler.orm.entity.DevAppEntity;

// tell cpd to start ignoring code - CPD-OFF
/**
 *  应用 ORM 实体: duzhou_dev_app_entity
 */
@SuppressWarnings({"PMD.UselessOverridingMethod","PMD.UnusedLocalVariable","java:S3008","java:S1602","java:S1128","java:S1161",
        "PMD.UnnecessaryFullyQualifiedName","PMD.EmptyControlStatement","java:S116","java:S115","java:S101","java:S3776"})
public class _DevAppEntity extends DynamicOrmEntity{
    
    /* ID: ID VARCHAR */
    public static final String PROP_NAME_id = "id";
    public static final int PROP_ID_id = 1;
    
    /* 创建人: CREATED_BY VARCHAR */
    public static final String PROP_NAME_createdBy = "createdBy";
    public static final int PROP_ID_createdBy = 2;
    
    /* 创建时间: CREATED_AT TIMESTAMP */
    public static final String PROP_NAME_createdAt = "createdAt";
    public static final int PROP_ID_createdAt = 3;
    
    /* 更新人: UPDATED_BY VARCHAR */
    public static final String PROP_NAME_updatedBy = "updatedBy";
    public static final int PROP_ID_updatedBy = 4;
    
    /* 更新时间: UPDATED_AT TIMESTAMP */
    public static final String PROP_NAME_updatedAt = "updatedAt";
    public static final int PROP_ID_updatedAt = 5;
    
    /* 数据版本: VER INTEGER */
    public static final String PROP_NAME_ver = "ver";
    public static final int PROP_ID_ver = 6;
    
    /* 所属模块: MODULE_ID VARCHAR */
    public static final String PROP_NAME_moduleId = "moduleId";
    public static final int PROP_ID_moduleId = 7;
    
    /* 显示名称: DISPLAY_NAME VARCHAR */
    public static final String PROP_NAME_displayName = "displayName";
    public static final int PROP_ID_displayName = 8;
    
    /* 实体名: NAME VARCHAR */
    public static final String PROP_NAME_name = "name";
    public static final int PROP_ID_name = 9;
    
    /* 表名: TABLE_NAME VARCHAR */
    public static final String PROP_NAME_tableName = "tableName";
    public static final int PROP_ID_tableName = 10;
    
    /* 标签: TAG_SET VARCHAR */
    public static final String PROP_NAME_tagSet = "tagSet";
    public static final int PROP_ID_tagSet = 11;
    
    /* 唯一键列表: UNIQUE_KEYS VARCHAR */
    public static final String PROP_NAME_uniqueKeysJsonText = "uniqueKeysJsonText";
    public static final int PROP_ID_uniqueKeysJsonText = 12;
    
    /* 别名列表: ALIASES VARCHAR */
    public static final String PROP_NAME_aliasesJsonText = "aliasesJsonText";
    public static final int PROP_ID_aliasesJsonText = 13;
    

    private static int _PROP_ID_BOUND = 14;

    
    /* relation:  */
    public static final String PROP_NAME_module = "module";
    
    /* relation:  */
    public static final String PROP_NAME_columns = "columns";
    
    /* relation:  */
    public static final String PROP_NAME_relations = "relations";
    
    /* alias: module.appId 应用 */
    public static final String PROP_NAME_appId = "appId";
    
    /* alias: uniqueKeysJsonTextComponent.data 唯一键列表 */
    public static final String PROP_NAME_uniqueKeys = "uniqueKeys";
    
    /* alias: aliasesJsonTextComponent.data 别名列表 */
    public static final String PROP_NAME_aliases = "aliases";
    
    /* component:  */
    public static final String PROP_NAME_uniqueKeysJsonTextComponent = "uniqueKeysJsonTextComponent";
    
    /* component:  */
    public static final String PROP_NAME_aliasesJsonTextComponent = "aliasesJsonTextComponent";
    

    protected static final List<String> PK_PROP_NAMES = Arrays.asList(PROP_NAME_id);
    protected static final int[] PK_PROP_IDS = new int[]{PROP_ID_id};

    private static final String[] PROP_ID_TO_NAME = new String[14];
    private static final Map<String,Integer> PROP_NAME_TO_ID = new HashMap<>();
    static{
      
          PROP_ID_TO_NAME[PROP_ID_id] = PROP_NAME_id;
          PROP_NAME_TO_ID.put(PROP_NAME_id, PROP_ID_id);
      
          PROP_ID_TO_NAME[PROP_ID_createdBy] = PROP_NAME_createdBy;
          PROP_NAME_TO_ID.put(PROP_NAME_createdBy, PROP_ID_createdBy);
      
          PROP_ID_TO_NAME[PROP_ID_createdAt] = PROP_NAME_createdAt;
          PROP_NAME_TO_ID.put(PROP_NAME_createdAt, PROP_ID_createdAt);
      
          PROP_ID_TO_NAME[PROP_ID_updatedBy] = PROP_NAME_updatedBy;
          PROP_NAME_TO_ID.put(PROP_NAME_updatedBy, PROP_ID_updatedBy);
      
          PROP_ID_TO_NAME[PROP_ID_updatedAt] = PROP_NAME_updatedAt;
          PROP_NAME_TO_ID.put(PROP_NAME_updatedAt, PROP_ID_updatedAt);
      
          PROP_ID_TO_NAME[PROP_ID_ver] = PROP_NAME_ver;
          PROP_NAME_TO_ID.put(PROP_NAME_ver, PROP_ID_ver);
      
          PROP_ID_TO_NAME[PROP_ID_moduleId] = PROP_NAME_moduleId;
          PROP_NAME_TO_ID.put(PROP_NAME_moduleId, PROP_ID_moduleId);
      
          PROP_ID_TO_NAME[PROP_ID_displayName] = PROP_NAME_displayName;
          PROP_NAME_TO_ID.put(PROP_NAME_displayName, PROP_ID_displayName);
      
          PROP_ID_TO_NAME[PROP_ID_name] = PROP_NAME_name;
          PROP_NAME_TO_ID.put(PROP_NAME_name, PROP_ID_name);
      
          PROP_ID_TO_NAME[PROP_ID_tableName] = PROP_NAME_tableName;
          PROP_NAME_TO_ID.put(PROP_NAME_tableName, PROP_ID_tableName);
      
          PROP_ID_TO_NAME[PROP_ID_tagSet] = PROP_NAME_tagSet;
          PROP_NAME_TO_ID.put(PROP_NAME_tagSet, PROP_ID_tagSet);
      
          PROP_ID_TO_NAME[PROP_ID_uniqueKeysJsonText] = PROP_NAME_uniqueKeysJsonText;
          PROP_NAME_TO_ID.put(PROP_NAME_uniqueKeysJsonText, PROP_ID_uniqueKeysJsonText);
      
          PROP_ID_TO_NAME[PROP_ID_aliasesJsonText] = PROP_NAME_aliasesJsonText;
          PROP_NAME_TO_ID.put(PROP_NAME_aliasesJsonText, PROP_ID_aliasesJsonText);
      
    }

    
    /* ID: ID */
    private java.lang.String _id;
    
    /* 创建人: CREATED_BY */
    private java.lang.String _createdBy;
    
    /* 创建时间: CREATED_AT */
    private java.sql.Timestamp _createdAt;
    
    /* 更新人: UPDATED_BY */
    private java.lang.String _updatedBy;
    
    /* 更新时间: UPDATED_AT */
    private java.sql.Timestamp _updatedAt;
    
    /* 数据版本: VER */
    private java.lang.Integer _ver;
    
    /* 所属模块: MODULE_ID */
    private java.lang.String _moduleId;
    
    /* 显示名称: DISPLAY_NAME */
    private java.lang.String _displayName;
    
    /* 实体名: NAME */
    private java.lang.String _name;
    
    /* 表名: TABLE_NAME */
    private java.lang.String _tableName;
    
    /* 标签: TAG_SET */
    private java.lang.String _tagSet;
    
    /* 唯一键列表: UNIQUE_KEYS */
    private java.lang.String _uniqueKeysJsonText;
    
    /* 别名列表: ALIASES */
    private java.lang.String _aliasesJsonText;
    

    public _DevAppEntity(){
        // for debug
    }

    protected DevAppEntity newInstance(){
       return new DevAppEntity();
    }

    @Override
    public DevAppEntity cloneInstance() {
        DevAppEntity entity = newInstance();
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
      return "io.crazydan.duzhou.platform.app_modeler.orm.entity.DevAppEntity";
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
        
            case PROP_ID_createdBy:
               return getCreatedBy();
        
            case PROP_ID_createdAt:
               return getCreatedAt();
        
            case PROP_ID_updatedBy:
               return getUpdatedBy();
        
            case PROP_ID_updatedAt:
               return getUpdatedAt();
        
            case PROP_ID_ver:
               return getVer();
        
            case PROP_ID_moduleId:
               return getModuleId();
        
            case PROP_ID_displayName:
               return getDisplayName();
        
            case PROP_ID_name:
               return getName();
        
            case PROP_ID_tableName:
               return getTableName();
        
            case PROP_ID_tagSet:
               return getTagSet();
        
            case PROP_ID_uniqueKeysJsonText:
               return getUniqueKeysJsonText();
        
            case PROP_ID_aliasesJsonText:
               return getAliasesJsonText();
        
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
        
            case PROP_ID_createdBy:{
               java.lang.String typedValue = null;
               if(value != null){
                   typedValue = ConvertHelper.toString(value,
                       err-> newTypeConversionError(PROP_NAME_createdBy));
               }
               setCreatedBy(typedValue);
               break;
            }
        
            case PROP_ID_createdAt:{
               java.sql.Timestamp typedValue = null;
               if(value != null){
                   typedValue = ConvertHelper.toTimestamp(value,
                       err-> newTypeConversionError(PROP_NAME_createdAt));
               }
               setCreatedAt(typedValue);
               break;
            }
        
            case PROP_ID_updatedBy:{
               java.lang.String typedValue = null;
               if(value != null){
                   typedValue = ConvertHelper.toString(value,
                       err-> newTypeConversionError(PROP_NAME_updatedBy));
               }
               setUpdatedBy(typedValue);
               break;
            }
        
            case PROP_ID_updatedAt:{
               java.sql.Timestamp typedValue = null;
               if(value != null){
                   typedValue = ConvertHelper.toTimestamp(value,
                       err-> newTypeConversionError(PROP_NAME_updatedAt));
               }
               setUpdatedAt(typedValue);
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
        
            case PROP_ID_moduleId:{
               java.lang.String typedValue = null;
               if(value != null){
                   typedValue = ConvertHelper.toString(value,
                       err-> newTypeConversionError(PROP_NAME_moduleId));
               }
               setModuleId(typedValue);
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
        
            case PROP_ID_tableName:{
               java.lang.String typedValue = null;
               if(value != null){
                   typedValue = ConvertHelper.toString(value,
                       err-> newTypeConversionError(PROP_NAME_tableName));
               }
               setTableName(typedValue);
               break;
            }
        
            case PROP_ID_tagSet:{
               java.lang.String typedValue = null;
               if(value != null){
                   typedValue = ConvertHelper.toString(value,
                       err-> newTypeConversionError(PROP_NAME_tagSet));
               }
               setTagSet(typedValue);
               break;
            }
        
            case PROP_ID_uniqueKeysJsonText:{
               java.lang.String typedValue = null;
               if(value != null){
                   typedValue = ConvertHelper.toString(value,
                       err-> newTypeConversionError(PROP_NAME_uniqueKeysJsonText));
               }
               setUniqueKeysJsonText(typedValue);
               break;
            }
        
            case PROP_ID_aliasesJsonText:{
               java.lang.String typedValue = null;
               if(value != null){
                   typedValue = ConvertHelper.toString(value,
                       err-> newTypeConversionError(PROP_NAME_aliasesJsonText));
               }
               setAliasesJsonText(typedValue);
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
        
            case PROP_ID_createdBy:{
               onInitProp(propId);
               this._createdBy = (java.lang.String)value;
               
               break;
            }
        
            case PROP_ID_createdAt:{
               onInitProp(propId);
               this._createdAt = (java.sql.Timestamp)value;
               
               break;
            }
        
            case PROP_ID_updatedBy:{
               onInitProp(propId);
               this._updatedBy = (java.lang.String)value;
               
               break;
            }
        
            case PROP_ID_updatedAt:{
               onInitProp(propId);
               this._updatedAt = (java.sql.Timestamp)value;
               
               break;
            }
        
            case PROP_ID_ver:{
               onInitProp(propId);
               this._ver = (java.lang.Integer)value;
               
               break;
            }
        
            case PROP_ID_moduleId:{
               onInitProp(propId);
               this._moduleId = (java.lang.String)value;
               
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
        
            case PROP_ID_tableName:{
               onInitProp(propId);
               this._tableName = (java.lang.String)value;
               
               break;
            }
        
            case PROP_ID_tagSet:{
               onInitProp(propId);
               this._tagSet = (java.lang.String)value;
               
               break;
            }
        
            case PROP_ID_uniqueKeysJsonText:{
               onInitProp(propId);
               this._uniqueKeysJsonText = (java.lang.String)value;
               
               break;
            }
        
            case PROP_ID_aliasesJsonText:{
               onInitProp(propId);
               this._aliasesJsonText = (java.lang.String)value;
               
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
     * 创建人: CREATED_BY
     */
    public java.lang.String getCreatedBy(){
         onPropGet(PROP_ID_createdBy);
         return _createdBy;
    }

    /**
     * 创建人: CREATED_BY
     */
    public void setCreatedBy(java.lang.String value){
        if(onPropSet(PROP_ID_createdBy,value)){
            this._createdBy = value;
            internalClearRefs(PROP_ID_createdBy);
            
        }
    }
    
    /**
     * 创建时间: CREATED_AT
     */
    public java.sql.Timestamp getCreatedAt(){
         onPropGet(PROP_ID_createdAt);
         return _createdAt;
    }

    /**
     * 创建时间: CREATED_AT
     */
    public void setCreatedAt(java.sql.Timestamp value){
        if(onPropSet(PROP_ID_createdAt,value)){
            this._createdAt = value;
            internalClearRefs(PROP_ID_createdAt);
            
        }
    }
    
    /**
     * 更新人: UPDATED_BY
     */
    public java.lang.String getUpdatedBy(){
         onPropGet(PROP_ID_updatedBy);
         return _updatedBy;
    }

    /**
     * 更新人: UPDATED_BY
     */
    public void setUpdatedBy(java.lang.String value){
        if(onPropSet(PROP_ID_updatedBy,value)){
            this._updatedBy = value;
            internalClearRefs(PROP_ID_updatedBy);
            
        }
    }
    
    /**
     * 更新时间: UPDATED_AT
     */
    public java.sql.Timestamp getUpdatedAt(){
         onPropGet(PROP_ID_updatedAt);
         return _updatedAt;
    }

    /**
     * 更新时间: UPDATED_AT
     */
    public void setUpdatedAt(java.sql.Timestamp value){
        if(onPropSet(PROP_ID_updatedAt,value)){
            this._updatedAt = value;
            internalClearRefs(PROP_ID_updatedAt);
            
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
     * 所属模块: MODULE_ID
     */
    public java.lang.String getModuleId(){
         onPropGet(PROP_ID_moduleId);
         return _moduleId;
    }

    /**
     * 所属模块: MODULE_ID
     */
    public void setModuleId(java.lang.String value){
        if(onPropSet(PROP_ID_moduleId,value)){
            this._moduleId = value;
            internalClearRefs(PROP_ID_moduleId);
            
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
     * 实体名: NAME
     */
    public java.lang.String getName(){
         onPropGet(PROP_ID_name);
         return _name;
    }

    /**
     * 实体名: NAME
     */
    public void setName(java.lang.String value){
        if(onPropSet(PROP_ID_name,value)){
            this._name = value;
            internalClearRefs(PROP_ID_name);
            
        }
    }
    
    /**
     * 表名: TABLE_NAME
     */
    public java.lang.String getTableName(){
         onPropGet(PROP_ID_tableName);
         return _tableName;
    }

    /**
     * 表名: TABLE_NAME
     */
    public void setTableName(java.lang.String value){
        if(onPropSet(PROP_ID_tableName,value)){
            this._tableName = value;
            internalClearRefs(PROP_ID_tableName);
            
        }
    }
    
    /**
     * 标签: TAG_SET
     */
    public java.lang.String getTagSet(){
         onPropGet(PROP_ID_tagSet);
         return _tagSet;
    }

    /**
     * 标签: TAG_SET
     */
    public void setTagSet(java.lang.String value){
        if(onPropSet(PROP_ID_tagSet,value)){
            this._tagSet = value;
            internalClearRefs(PROP_ID_tagSet);
            
        }
    }
    
    /**
     * 唯一键列表: UNIQUE_KEYS
     */
    public java.lang.String getUniqueKeysJsonText(){
         onPropGet(PROP_ID_uniqueKeysJsonText);
         return _uniqueKeysJsonText;
    }

    /**
     * 唯一键列表: UNIQUE_KEYS
     */
    public void setUniqueKeysJsonText(java.lang.String value){
        if(onPropSet(PROP_ID_uniqueKeysJsonText,value)){
            this._uniqueKeysJsonText = value;
            internalClearRefs(PROP_ID_uniqueKeysJsonText);
            
        }
    }
    
    /**
     * 别名列表: ALIASES
     */
    public java.lang.String getAliasesJsonText(){
         onPropGet(PROP_ID_aliasesJsonText);
         return _aliasesJsonText;
    }

    /**
     * 别名列表: ALIASES
     */
    public void setAliasesJsonText(java.lang.String value){
        if(onPropSet(PROP_ID_aliasesJsonText,value)){
            this._aliasesJsonText = value;
            internalClearRefs(PROP_ID_aliasesJsonText);
            
        }
    }
    
    /**
     * 
     */
    public io.crazydan.duzhou.platform.app_modeler.orm.entity.DevAppModule getModule(){
       return (io.crazydan.duzhou.platform.app_modeler.orm.entity.DevAppModule)internalGetRefEntity(PROP_NAME_module);
    }

    public void setModule(io.crazydan.duzhou.platform.app_modeler.orm.entity.DevAppModule refEntity){
   
           if(refEntity == null){
           
                   this.setModuleId(null);
               
           }else{
           internalSetRefEntity(PROP_NAME_module, refEntity,()->{
           
                           this.setModuleId(refEntity.getId());
                       
           });
           }
       
    }
       
    private final OrmEntitySet<io.crazydan.duzhou.platform.app_modeler.orm.entity.DevAppEntityColumn> _columns = new OrmEntitySet<>(this, PROP_NAME_columns,
        io.crazydan.duzhou.platform.app_modeler.orm.entity.DevAppEntityColumn.PROP_NAME_entity, null,io.crazydan.duzhou.platform.app_modeler.orm.entity.DevAppEntityColumn.class);

    /**
     * 。 refPropName: entity, keyProp: {rel.keyProp}
     */
    public IOrmEntitySet<io.crazydan.duzhou.platform.app_modeler.orm.entity.DevAppEntityColumn> getColumns(){
       return _columns;
    }
       
    private final OrmEntitySet<io.crazydan.duzhou.platform.app_modeler.orm.entity.DevAppEntityRelation> _relations = new OrmEntitySet<>(this, PROP_NAME_relations,
        io.crazydan.duzhou.platform.app_modeler.orm.entity.DevAppEntityRelation.PROP_NAME_source, null,io.crazydan.duzhou.platform.app_modeler.orm.entity.DevAppEntityRelation.class);

    /**
     * 。 refPropName: source, keyProp: {rel.keyProp}
     */
    public IOrmEntitySet<io.crazydan.duzhou.platform.app_modeler.orm.entity.DevAppEntityRelation> getRelations(){
       return _relations;
    }
       
   public java.lang.String getAppId(){
      return (java.lang.String)internalGetAliasValue("module.appId");
   }

   public void setAppId(java.lang.String value){
      internalSetAliasValue("module.appId",value);
   }

   public java.lang.Object getUniqueKeys(){
      return (java.lang.Object)internalGetAliasValue("uniqueKeysJsonTextComponent.data");
   }

   public void setUniqueKeys(java.lang.Object value){
      internalSetAliasValue("uniqueKeysJsonTextComponent.data",value);
   }

   public java.lang.Object getAliases(){
      return (java.lang.Object)internalGetAliasValue("aliasesJsonTextComponent.data");
   }

   public void setAliases(java.lang.Object value){
      internalSetAliasValue("aliasesJsonTextComponent.data",value);
   }

   private io.nop.orm.component.JsonOrmComponent _uniqueKeysJsonTextComponent;

   private static Map<String,Integer> COMPONENT_PROP_ID_MAP_uniqueKeysJsonTextComponent = new HashMap<>();
   static{
      
         COMPONENT_PROP_ID_MAP_uniqueKeysJsonTextComponent.put(io.nop.orm.component.JsonOrmComponent.PROP_NAME__jsonText,PROP_ID_uniqueKeysJsonText);
      
   }

   public io.nop.orm.component.JsonOrmComponent getUniqueKeysJsonTextComponent(){
      if(_uniqueKeysJsonTextComponent == null){
          _uniqueKeysJsonTextComponent = new io.nop.orm.component.JsonOrmComponent();
          _uniqueKeysJsonTextComponent.bindToEntity(this, COMPONENT_PROP_ID_MAP_uniqueKeysJsonTextComponent);
      }
      return _uniqueKeysJsonTextComponent;
   }

   private io.nop.orm.component.JsonOrmComponent _aliasesJsonTextComponent;

   private static Map<String,Integer> COMPONENT_PROP_ID_MAP_aliasesJsonTextComponent = new HashMap<>();
   static{
      
         COMPONENT_PROP_ID_MAP_aliasesJsonTextComponent.put(io.nop.orm.component.JsonOrmComponent.PROP_NAME__jsonText,PROP_ID_aliasesJsonText);
      
   }

   public io.nop.orm.component.JsonOrmComponent getAliasesJsonTextComponent(){
      if(_aliasesJsonTextComponent == null){
          _aliasesJsonTextComponent = new io.nop.orm.component.JsonOrmComponent();
          _aliasesJsonTextComponent.bindToEntity(this, COMPONENT_PROP_ID_MAP_aliasesJsonTextComponent);
      }
      return _aliasesJsonTextComponent;
   }

}
// resume CPD analysis - CPD-ON