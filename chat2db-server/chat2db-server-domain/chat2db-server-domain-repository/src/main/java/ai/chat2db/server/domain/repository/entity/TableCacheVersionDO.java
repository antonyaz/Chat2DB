package ai.chat2db.server.domain.repository.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.util.Date;
import lombok.Getter;
import lombok.Setter;

/**
 * <p>
 * table cache version
 * </p>
 *
 * @author chat2db
 * @since 2023-10-11
 */
@Getter
@Setter
@TableName("TABLE_CACHE_VERSION")
public class TableCacheVersionDO implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 主键
     */
    @TableId(value = "ID", type = IdType.AUTO)
    private Long id;

    /**
     * 创建时间
     */
    private Date gmtCreate;

    /**
     * 修改时间
     */
    private Date gmtModified;

    /**
     * 数据源连接ID
     */
    private Long dataSourceId;

    /**
     * db名称
     */
    private String databaseName;

    /**
     * schema名称
     */
    private String schemaName;

    /**
     * 唯一索引
     */
    @TableField(value = "`key`")
    private String key;

    /**
     * 版本
     */
    private Long version;

    /**
     * 表数量
     */
    private Long tableCount;

    /**
     * 状态
     */
    @TableField("`status`")
    private String status;
}
