package com.fego.transaction.dto;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.annotation.JsonProperty;

public class TransactionRequestDto {

	@JsonProperty("UserId")
	private long userId;
	@JsonProperty("txnMap")
	Map<String, TransactionDto> txnMap = new HashMap<>();
	@JsonProperty("txnListMap")
	Map<String, List<TransactionDto>> txnListMap = new HashMap<>();

	public long getUserId() {
		return userId;
	}

	public void setUserId(long userId) {
		this.userId = userId;
	}

	public Map<String, TransactionDto> getTxnMap() {
		return txnMap;
	}

	public void setTxnMap(Map<String, TransactionDto> txnMap) {
		this.txnMap = txnMap;
	}

	public Map<String, List<TransactionDto>> getTxnListMap() {
		return txnListMap;
	}

	public void setTxnListMap(Map<String, List<TransactionDto>> txnListMap) {
		this.txnListMap = txnListMap;
	}

	@Override
	public String toString() {
		return "TransactionRequestDto [userId=" + userId + ", txnMap=" + txnMap + ", txnListMap=" + txnListMap + "]";
	}
}