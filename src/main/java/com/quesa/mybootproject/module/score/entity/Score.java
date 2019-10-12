package com.quesa.mybootproject.module.score.entity;
import java.io.Serializable;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.JSONException;
import java.util.Date;
import com.quesa.mybootproject.common.util.DateUtil;
import io.swagger.annotations.ApiModelProperty;
import com.quesa.mybootproject.common.persistence.DataEntity;
import javax.persistence.Column;
import javax.persistence.Table;
import lombok.Data;
import lombok.experimental.Accessors;

/**
 * 
 * 
 * 
 **/
@Data
@Accessors(chain = true)
@Table(name = "score")
public class Score extends DataEntity<Score>{

	/****/
	@Column(name = "id_")
	private String id;

	/**学生id**/
	@Column(name = "stu_id_")
	private String stuId;

	/**分数**/
	@Column(name = "score_")
	private Double score;

	/**创建时间**/
	@Column(name = "ct_")
	private Date ct;



	@Override
	public JSONObject toJSONObjcet() throws JSONException{
		JSONObject json = new JSONObject();
		return json;
	}
}