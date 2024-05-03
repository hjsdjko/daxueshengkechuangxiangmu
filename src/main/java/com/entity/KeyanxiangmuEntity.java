package com.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.beanutils.BeanUtils;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.enums.FieldFill;
import com.baomidou.mybatisplus.enums.IdType;

/**
 * 科研项目
 *
 * @author 
 * @email
 */
@TableName("keyanxiangmu")
public class KeyanxiangmuEntity<T> implements Serializable {
    private static final long serialVersionUID = 1L;


	public KeyanxiangmuEntity() {

	}

	public KeyanxiangmuEntity(T t) {
		try {
			BeanUtils.copyProperties(this, t);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}


    /**
     * 主键
     */
    @TableId(type = IdType.AUTO)
    @TableField(value = "id")

    private Integer id;


    /**
     * 项目编号
     */
    @TableField(value = "keyanxiangmu_uuid_number")

    private String keyanxiangmuUuidNumber;
    /**
     * 项目编号
     */
    @TableField(value = "xiaozhuchengyuan")

    private String xiaozhuchengyuan;

    public String getXiaozhuchengyuan() {
        return xiaozhuchengyuan;
    }

    public void setXiaozhuchengyuan(String xiaozhuchengyuan) {
        this.xiaozhuchengyuan = xiaozhuchengyuan;
    }

    /**
     * 项目名称
     */
    @TableField(value = "keyanxiangmu_name")

    private String keyanxiangmuName;


    /**
     * 项目类型
     */
    @TableField(value = "keyanxiangmu_types")

    private Integer keyanxiangmuTypes;


    /**
     * 附件
     */
    @TableField(value = "keyanxiangmu_file")

    private String keyanxiangmuFile;


    /**
     * 开始时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    @TableField(value = "insert_time",fill = FieldFill.INSERT)

    private Date insertTime;


    /**
     * 学生
     */
    @TableField(value = "yonghu_id")

    private Integer yonghuId;


    /**
     * 审核教师
     */
    @TableField(value = "jiaoshi_id")

    private Integer jiaoshiId;


    /**
     * 审核结果
     */
    @TableField(value = "keyanxiangmu_yesno_types")

    private Integer keyanxiangmuYesnoTypes;


    /**
     * 审核意见
     */
    @TableField(value = "shenheyijian_text")

    private String shenheyijianText;


    /**
     * 项目详情
     */
    @TableField(value = "keyanxiangmu_content")

    private String keyanxiangmuContent;


    /**
     * 假删
     */
    @TableField(value = "keyanxiangmu_delete")

    private Integer keyanxiangmuDelete;


    /**
     * 创建时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    @TableField(value = "create_time",fill = FieldFill.INSERT)

    private Date createTime;


    /**
	 * 设置：主键
	 */
    public Integer getId() {
        return id;
    }


    /**
	 * 获取：主键
	 */

    public void setId(Integer id) {
        this.id = id;
    }
    /**
	 * 设置：项目编号
	 */
    public String getKeyanxiangmuUuidNumber() {
        return keyanxiangmuUuidNumber;
    }


    /**
	 * 获取：项目编号
	 */

    public void setKeyanxiangmuUuidNumber(String keyanxiangmuUuidNumber) {
        this.keyanxiangmuUuidNumber = keyanxiangmuUuidNumber;
    }
    /**
	 * 设置：项目名称
	 */
    public String getKeyanxiangmuName() {
        return keyanxiangmuName;
    }


    /**
	 * 获取：项目名称
	 */

    public void setKeyanxiangmuName(String keyanxiangmuName) {
        this.keyanxiangmuName = keyanxiangmuName;
    }
    /**
	 * 设置：项目类型
	 */
    public Integer getKeyanxiangmuTypes() {
        return keyanxiangmuTypes;
    }


    /**
	 * 获取：项目类型
	 */

    public void setKeyanxiangmuTypes(Integer keyanxiangmuTypes) {
        this.keyanxiangmuTypes = keyanxiangmuTypes;
    }
    /**
	 * 设置：附件
	 */
    public String getKeyanxiangmuFile() {
        return keyanxiangmuFile;
    }


    /**
	 * 获取：附件
	 */

    public void setKeyanxiangmuFile(String keyanxiangmuFile) {
        this.keyanxiangmuFile = keyanxiangmuFile;
    }
    /**
	 * 设置：开始时间
	 */
    public Date getInsertTime() {
        return insertTime;
    }


    /**
	 * 获取：开始时间
	 */

    public void setInsertTime(Date insertTime) {
        this.insertTime = insertTime;
    }
    /**
	 * 设置：学生
	 */
    public Integer getYonghuId() {
        return yonghuId;
    }


    /**
	 * 获取：学生
	 */

    public void setYonghuId(Integer yonghuId) {
        this.yonghuId = yonghuId;
    }
    /**
	 * 设置：审核教师
	 */
    public Integer getJiaoshiId() {
        return jiaoshiId;
    }


    /**
	 * 获取：审核教师
	 */

    public void setJiaoshiId(Integer jiaoshiId) {
        this.jiaoshiId = jiaoshiId;
    }
    /**
	 * 设置：审核结果
	 */
    public Integer getKeyanxiangmuYesnoTypes() {
        return keyanxiangmuYesnoTypes;
    }


    /**
	 * 获取：审核结果
	 */

    public void setKeyanxiangmuYesnoTypes(Integer keyanxiangmuYesnoTypes) {
        this.keyanxiangmuYesnoTypes = keyanxiangmuYesnoTypes;
    }
    /**
	 * 设置：审核意见
	 */
    public String getShenheyijianText() {
        return shenheyijianText;
    }


    /**
	 * 获取：审核意见
	 */

    public void setShenheyijianText(String shenheyijianText) {
        this.shenheyijianText = shenheyijianText;
    }
    /**
	 * 设置：项目详情
	 */
    public String getKeyanxiangmuContent() {
        return keyanxiangmuContent;
    }


    /**
	 * 获取：项目详情
	 */

    public void setKeyanxiangmuContent(String keyanxiangmuContent) {
        this.keyanxiangmuContent = keyanxiangmuContent;
    }
    /**
	 * 设置：假删
	 */
    public Integer getKeyanxiangmuDelete() {
        return keyanxiangmuDelete;
    }


    /**
	 * 获取：假删
	 */

    public void setKeyanxiangmuDelete(Integer keyanxiangmuDelete) {
        this.keyanxiangmuDelete = keyanxiangmuDelete;
    }
    /**
	 * 设置：创建时间
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 获取：创建时间
	 */

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    @Override
    public String toString() {
        return "Keyanxiangmu{" +
            "id=" + id +
            ", keyanxiangmuUuidNumber=" + keyanxiangmuUuidNumber +
            ", keyanxiangmuName=" + keyanxiangmuName +
            ", keyanxiangmuTypes=" + keyanxiangmuTypes +
            ", keyanxiangmuFile=" + keyanxiangmuFile +
            ", insertTime=" + insertTime +
            ", yonghuId=" + yonghuId +
            ", jiaoshiId=" + jiaoshiId +
            ", keyanxiangmuYesnoTypes=" + keyanxiangmuYesnoTypes +
            ", shenheyijianText=" + shenheyijianText +
            ", keyanxiangmuContent=" + keyanxiangmuContent +
            ", keyanxiangmuDelete=" + keyanxiangmuDelete +
            ", createTime=" + createTime +
        "}";
    }
}
