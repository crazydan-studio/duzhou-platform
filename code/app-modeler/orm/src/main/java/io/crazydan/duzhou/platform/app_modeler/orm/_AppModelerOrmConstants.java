package io.crazydan.duzhou.platform.app_modeler.orm;

@SuppressWarnings({"PMD","java:S116"})
public interface _AppModelerOrmConstants {

    
    /**
     * 数据库类型: H2 
     */
    String DB_DIALECT_h2 = "h2";
                        
    /**
     * 数据库类型: MySQL 
     */
    String DB_DIALECT_mysql = "mysql";
                        
    /**
     * 数据库类型: Oracle 
     */
    String DB_DIALECT_oracle = "oracle";
                        
    /**
     * 实体字段标签: 不生成代码 
     */
    String ENTITY_COLUMN_TAGSET_not_gen = "not-gen";
                        
    /**
     * 实体字段标签: 生成唯一主键 
     */
    String ENTITY_COLUMN_TAGSET_seq = "seq";
                        
    /**
     * 实体字段标签: 删除该属性 
     */
    String ENTITY_COLUMN_TAGSET_del = "del";
                        
    /**
     * 实体字段标签: 生成随机值 
     */
    String ENTITY_COLUMN_TAGSET_var = "var";
                        
    /**
     * 实体字段标签: 在日志中打印掩码 
     */
    String ENTITY_COLUMN_TAGSET_masked = "masked";
                        
    /**
     * 实体字段标签: 值不可见 
     */
    String ENTITY_COLUMN_TAGSET_not_pub = "not-pub";
                        
    /**
     * 实体字段标签: 默认排序属性（升序） 
     */
    String ENTITY_COLUMN_TAGSET_sort = "sort";
                        
    /**
     * 实体字段标签: 默认排序属性（降序） 
     */
    String ENTITY_COLUMN_TAGSET_sort_desc = "sort-desc";
                        
    /**
     * 实体关联标签: 该关联可访问 
     */
    String ENTITY_RELATION_TAGSET_pub = "pub";
                        
    /**
     * 实体关联标签: 对端关联可访问 
     */
    String ENTITY_RELATION_TAGSET_ref_pub = "ref-pub";
                        
    /**
     * 实体关联标签: 级联删除 
     */
    String ENTITY_RELATION_TAGSET_ref_cascade_delete = "ref-cascade-delete";
                        
    /**
     * 实体关联类型: 一对一关联 
     */
    String ENTITY_RELATION_TYPE_to_one = "to-one";
                        
    /**
     * 实体关联类型: 一对多关联 
     */
    String ENTITY_RELATION_TYPE_to_many = "to-many";
                        
    /**
     * 实体标签: 不生成代码 
     */
    String ENTITY_TAGSET_not_gen = "not-gen";
                        
    /**
     * 实体标签: 删除该对象 
     */
    String ENTITY_TAGSET_del = "del";
                        
    /**
     * 实体标签: 需生成 SqlMapper 代码 
     */
    String ENTITY_TAGSET_mapper = "mapper";
                        
    /**
     * Web 启动器类型: Spring Boot 启动器 以 Spring Boot 作为模块的启动器
     */
    String WEB_STARTER_TYPE_spring = "spring";
                        
    /**
     * Web 启动器类型: Quarkus 启动器 以 Quarkus 作为模块的启动器
     */
    String WEB_STARTER_TYPE_quarkus = "quarkus";
                        
    /**
     * Web 启动器类型: Light4J 启动器 以 Light4J 作为模块的启动器
     */
    String WEB_STARTER_TYPE_light4j = "light4j";
                        
    
}
    
