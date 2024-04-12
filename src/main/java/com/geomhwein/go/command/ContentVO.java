package com.geomhwein.go.command;

import java.math.BigInteger;

import io.opencensus.common.Timestamp;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigInteger;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ContentVO {

	private BigInteger contsSn;
	private String contsNm;
	private String contsExpln;
	private Number contsPrc;
	private Timestamp contsYmd;
	private String imgNm;
	private String utiznTrmsCn;
	private String utiznNope;
	private String contsGrd;
	private String userId;
	private String keywords;

	public ContentVO(String userId, String keywords) {
		this.userId = userId;
		this.keywords = keywords;
	}
}
