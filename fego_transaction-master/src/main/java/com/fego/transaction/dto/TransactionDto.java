package com.fego.transaction.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class TransactionDto {

	private String amount;
	private String currentBalance;
	private String balance;
	private String mode;
	private String narration;
	private String reference;
	private String transactionTimestamp;
	private String txnId;
	private String type;
	private String valueDate;
	private String transactionDateTime;
	private String amc;
	private String registrar;
	private String schemeCode;
	private String schemePlan;
	private String schemeTypes;
	private String schemeCategory;
	private String isin;
	private String amfiCode;
	private String schemeOption;
	private String fundType;
	private String ucc;
	private String closingUnits;
	private String lienUnits;
	private String nav;
	private String navDate;
	private String orderDate;
	private String executionDate;
	@JsonProperty("lock-inDays")
	private String lockinDays;
	@JsonProperty("lock-inFlag")
	private String lockinFlag;
	private String cost;
	private String premium;
	private String premiumAllocationCharge;
	private String otherCharges;
	private String units;
	private String fundName;
	private String txnDate;
	private String employeeDepositAmount;
	private String employerDepositAmount;
	private String employeeWithdrawalAmount;
	private String employerWithdrawalAmount;
	private String pensionFundAmount;
	private String txnType;
	private String statementDate;
	private String mcc;
	private String maskedCardNumber;
	private String issuerName;
	private String symbol;
	private String exchange;
	private String transactionDescription;
	private String price;
	private String unitsType;
	private String numUnitsTransacted;
	private String tradeValue;
	private String totalCharge;
	private String nameofAsset;
	private String investmentDateTime;
	private String investmentValue;
	private String redemptionDate;
	private String redemptionValue;
	private String fundFeesPaymentDate;
	private String fundFeesPaymentAmount;
	private String reInvestmentDate;
	private String reInvestmentValue;
	private String paymentInvestorDate;
	private String paymentInvestorAmount;
	private String taxPaidValue;
	private String taxPaidDate;
	private String dividendType;
	private String orderId;
	private String tradeId;
	private String companyName;
	private String rate;
	private String shareHolerEquityType;
	private String schemeName;
	private String dpId;
	private String schemeMinLotSize;
	private String faceValueofUnits;
	private String brokerCode;
	private String currency;
	private String otherTaxes;
	private String equityCategory;
	private String instrumentType;
	private String optionType;
	private String strikePrice;
	private String shareHolderEquityType;
	private String stt;
	private String scheme;
	private String folioNo;

	public String getTxnType() {
		return txnType;
	}

	public void setTxnType(String txnType) {
		this.txnType = txnType;
	}

	public String getStatementDate() {
		return statementDate;
	}

	public void setStatementDate(String statementDate) {
		this.statementDate = statementDate;
	}

	public String getMcc() {
		return mcc;
	}

	public void setMcc(String mcc) {
		this.mcc = mcc;
	}

	public String getMaskedCardNumber() {
		return maskedCardNumber;
	}

	public void setMaskedCardNumber(String maskedCardNumber) {
		this.maskedCardNumber = maskedCardNumber;
	}

	public String getIssuerName() {
		return issuerName;
	}

	public void setIssuerName(String issuerName) {
		this.issuerName = issuerName;
	}

	public String getSymbol() {
		return symbol;
	}

	public void setSymbol(String symbol) {
		this.symbol = symbol;
	}

	public String getExchange() {
		return exchange;
	}

	public void setExchange(String exchange) {
		this.exchange = exchange;
	}

	public String getTransactionDescription() {
		return transactionDescription;
	}

	public void setTransactionDescription(String transactionDescription) {
		this.transactionDescription = transactionDescription;
	}

	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
	}

	public String getUnitsType() {
		return unitsType;
	}

	public void setUnitsType(String unitsType) {
		this.unitsType = unitsType;
	}

	public String getNumUnitsTransacted() {
		return numUnitsTransacted;
	}

	public void setNumUnitsTransacted(String numUnitsTransacted) {
		this.numUnitsTransacted = numUnitsTransacted;
	}

	public String getTradeValue() {
		return tradeValue;
	}

	public void setTradeValue(String tradeValue) {
		this.tradeValue = tradeValue;
	}

	public String getTotalCharge() {
		return totalCharge;
	}

	public void setTotalCharge(String totalCharge) {
		this.totalCharge = totalCharge;
	}

	public String getNameofAsset() {
		return nameofAsset;
	}

	public void setNameofAsset(String nameofAsset) {
		this.nameofAsset = nameofAsset;
	}

	public String getInvestmentDateTime() {
		return investmentDateTime;
	}

	public void setInvestmentDateTime(String investmentDateTime) {
		this.investmentDateTime = investmentDateTime;
	}

	public String getInvestmentValue() {
		return investmentValue;
	}

	public void setInvestmentValue(String investmentValue) {
		this.investmentValue = investmentValue;
	}

	public String getRedemptionDate() {
		return redemptionDate;
	}

	public void setRedemptionDate(String redemptionDate) {
		this.redemptionDate = redemptionDate;
	}

	public String getRedemptionValue() {
		return redemptionValue;
	}

	public void setRedemptionValue(String redemptionValue) {
		this.redemptionValue = redemptionValue;
	}

	public String getFundFeesPaymentDate() {
		return fundFeesPaymentDate;
	}

	public void setFundFeesPaymentDate(String fundFeesPaymentDate) {
		this.fundFeesPaymentDate = fundFeesPaymentDate;
	}

	public String getFundFeesPaymentAmount() {
		return fundFeesPaymentAmount;
	}

	public void setFundFeesPaymentAmount(String fundFeesPaymentAmount) {
		this.fundFeesPaymentAmount = fundFeesPaymentAmount;
	}

	public String getReInvestmentDate() {
		return reInvestmentDate;
	}

	public void setReInvestmentDate(String reInvestmentDate) {
		this.reInvestmentDate = reInvestmentDate;
	}

	public String getReInvestmentValue() {
		return reInvestmentValue;
	}

	public void setReInvestmentValue(String reInvestmentValue) {
		this.reInvestmentValue = reInvestmentValue;
	}

	public String getPaymentInvestorDate() {
		return paymentInvestorDate;
	}

	public void setPaymentInvestorDate(String paymentInvestorDate) {
		this.paymentInvestorDate = paymentInvestorDate;
	}

	public String getPaymentInvestorAmount() {
		return paymentInvestorAmount;
	}

	public void setPaymentInvestorAmount(String paymentInvestorAmount) {
		this.paymentInvestorAmount = paymentInvestorAmount;
	}

	public String getTaxPaidValue() {
		return taxPaidValue;
	}

	public void setTaxPaidValue(String taxPaidValue) {
		this.taxPaidValue = taxPaidValue;
	}

	public String getTaxPaidDate() {
		return taxPaidDate;
	}

	public void setTaxPaidDate(String taxPaidDate) {
		this.taxPaidDate = taxPaidDate;
	}

	public String getDividendType() {
		return dividendType;
	}

	public void setDividendType(String dividendType) {
		this.dividendType = dividendType;
	}

	public String getOrderId() {
		return orderId;
	}

	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}

	public String getTradeId() {
		return tradeId;
	}

	public void setTradeId(String tradeId) {
		this.tradeId = tradeId;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public String getRate() {
		return rate;
	}

	public void setRate(String rate) {
		this.rate = rate;
	}

	public String getShareHolerEquityType() {
		return shareHolerEquityType;
	}

	public void setShareHolerEquityType(String shareHolerEquityType) {
		this.shareHolerEquityType = shareHolerEquityType;
	}

	public String getSchemeName() {
		return schemeName;
	}

	public void setSchemeName(String schemeName) {
		this.schemeName = schemeName;
	}

	public String getDpId() {
		return dpId;
	}

	public void setDpId(String dpId) {
		this.dpId = dpId;
	}

	public String getSchemeMinLotSize() {
		return schemeMinLotSize;
	}

	public void setSchemeMinLotSize(String schemeMinLotSize) {
		this.schemeMinLotSize = schemeMinLotSize;
	}

	public String getFaceValueofUnits() {
		return faceValueofUnits;
	}

	public void setFaceValueofUnits(String faceValueofUnits) {
		this.faceValueofUnits = faceValueofUnits;
	}

	public String getBrokerCode() {
		return brokerCode;
	}

	public void setBrokerCode(String brokerCode) {
		this.brokerCode = brokerCode;
	}

	public String getCurrency() {
		return currency;
	}

	public void setCurrency(String currency) {
		this.currency = currency;
	}

	public String getOtherTaxes() {
		return otherTaxes;
	}

	public void setOtherTaxes(String otherTaxes) {
		this.otherTaxes = otherTaxes;
	}

	public String getEquityCategory() {
		return equityCategory;
	}

	public void setEquityCategory(String equityCategory) {
		this.equityCategory = equityCategory;
	}

	public String getInstrumentType() {
		return instrumentType;
	}

	public void setInstrumentType(String instrumentType) {
		this.instrumentType = instrumentType;
	}

	public String getOptionType() {
		return optionType;
	}

	public void setOptionType(String optionType) {
		this.optionType = optionType;
	}

	public String getStrikePrice() {
		return strikePrice;
	}

	public void setStrikePrice(String strikePrice) {
		this.strikePrice = strikePrice;
	}

	public String getShareHolderEquityType() {
		return shareHolderEquityType;
	}

	public void setShareHolderEquityType(String shareHolderEquityType) {
		this.shareHolderEquityType = shareHolderEquityType;
	}

	public String getStt() {
		return stt;
	}

	public void setStt(String stt) {
		this.stt = stt;
	}

	public String getScheme() {
		return scheme;
	}

	public void setScheme(String scheme) {
		this.scheme = scheme;
	}

	public String getFolioNo() {
		return folioNo;
	}

	public void setFolioNo(String folioNo) {
		this.folioNo = folioNo;
	}

	public String getEmployeeDepositAmount() {
		return employeeDepositAmount;
	}

	public void setEmployeeDepositAmount(String employeeDepositAmount) {
		this.employeeDepositAmount = employeeDepositAmount;
	}

	public String getEmployerDepositAmount() {
		return employerDepositAmount;
	}

	public void setEmployerDepositAmount(String employerDepositAmount) {
		this.employerDepositAmount = employerDepositAmount;
	}

	public String getEmployeeWithdrawalAmount() {
		return employeeWithdrawalAmount;
	}

	public void setEmployeeWithdrawalAmount(String employeeWithdrawalAmount) {
		this.employeeWithdrawalAmount = employeeWithdrawalAmount;
	}

	public String getEmployerWithdrawalAmount() {
		return employerWithdrawalAmount;
	}

	public void setEmployerWithdrawalAmount(String employerWithdrawalAmount) {
		this.employerWithdrawalAmount = employerWithdrawalAmount;
	}

	public String getPensionFundAmount() {
		return pensionFundAmount;
	}

	public void setPensionFundAmount(String pensionFundAmount) {
		this.pensionFundAmount = pensionFundAmount;
	}

	public String getCost() {
		return cost;
	}

	public void setCost(String cost) {
		this.cost = cost;
	}

	public String getPremium() {
		return premium;
	}

	public void setPremium(String premium) {
		this.premium = premium;
	}

	public String getPremiumAllocationCharge() {
		return premiumAllocationCharge;
	}

	public void setPremiumAllocationCharge(String premiumAllocationCharge) {
		this.premiumAllocationCharge = premiumAllocationCharge;
	}

	public String getOtherCharges() {
		return otherCharges;
	}

	public void setOtherCharges(String otherCharges) {
		this.otherCharges = otherCharges;
	}

	public String getUnits() {
		return units;
	}

	public void setUnits(String units) {
		this.units = units;
	}

	public String getFundName() {
		return fundName;
	}

	public void setFundName(String fundName) {
		this.fundName = fundName;
	}

	public String getTxnDate() {
		return txnDate;
	}

	public void setTxnDate(String txnDate) {
		this.txnDate = txnDate;
	}

	public String getAmc() {
		return amc;
	}

	public void setAmc(String amc) {
		this.amc = amc;
	}

	public String getRegistrar() {
		return registrar;
	}

	public void setRegistrar(String registrar) {
		this.registrar = registrar;
	}

	public String getSchemeCode() {
		return schemeCode;
	}

	public void setSchemeCode(String schemeCode) {
		this.schemeCode = schemeCode;
	}

	public String getSchemePlan() {
		return schemePlan;
	}

	public void setSchemePlan(String schemePlan) {
		this.schemePlan = schemePlan;
	}

	public String getSchemeTypes() {
		return schemeTypes;
	}

	public void setSchemeTypes(String schemeTypes) {
		this.schemeTypes = schemeTypes;
	}

	public String getSchemeCategory() {
		return schemeCategory;
	}

	public void setSchemeCategory(String schemeCategory) {
		this.schemeCategory = schemeCategory;
	}

	public String getIsin() {
		return isin;
	}

	public void setIsin(String isin) {
		this.isin = isin;
	}

	public String getAmfiCode() {
		return amfiCode;
	}

	public void setAmfiCode(String amfiCode) {
		this.amfiCode = amfiCode;
	}

	public String getSchemeOption() {
		return schemeOption;
	}

	public void setSchemeOption(String schemeOption) {
		this.schemeOption = schemeOption;
	}

	public String getFundType() {
		return fundType;
	}

	public void setFundType(String fundType) {
		this.fundType = fundType;
	}

	public String getUcc() {
		return ucc;
	}

	public void setUcc(String ucc) {
		this.ucc = ucc;
	}

	public String getClosingUnits() {
		return closingUnits;
	}

	public void setClosingUnits(String closingUnits) {
		this.closingUnits = closingUnits;
	}

	public String getLienUnits() {
		return lienUnits;
	}

	public void setLienUnits(String lienUnits) {
		this.lienUnits = lienUnits;
	}

	public String getNav() {
		return nav;
	}

	public void setNav(String nav) {
		this.nav = nav;
	}

	public String getNavDate() {
		return navDate;
	}

	public void setNavDate(String navDate) {
		this.navDate = navDate;
	}

	public String getOrderDate() {
		return orderDate;
	}

	public void setOrderDate(String orderDate) {
		this.orderDate = orderDate;
	}

	public String getExecutionDate() {
		return executionDate;
	}

	public void setExecutionDate(String executionDate) {
		this.executionDate = executionDate;
	}

	public String getLockinDays() {
		return lockinDays;
	}

	public void setLockinDays(String lockinDays) {
		this.lockinDays = lockinDays;
	}

	public String getLockinFlag() {
		return lockinFlag;
	}

	public void setLockinFlag(String lockinFlag) {
		this.lockinFlag = lockinFlag;
	}

	public String getTransactionDateTime() {
		return transactionDateTime;
	}

	public void setTransactionDateTime(String transactionDateTime) {
		this.transactionDateTime = transactionDateTime;
	}

	public String getAmount() {
		return amount;
	}

	public void setAmount(String amount) {
		this.amount = amount;
	}

	public String getCurrentBalance() {
		return currentBalance;
	}

	public void setCurrentBalance(String currentBalance) {
		this.currentBalance = currentBalance;
	}

	public String getMode() {
		return mode;
	}

	public void setMode(String mode) {
		this.mode = mode;
	}

	public String getNarration() {
		return narration;
	}

	public void setNarration(String narration) {
		this.narration = narration;
	}

	public String getReference() {
		return reference;
	}

	public void setReference(String reference) {
		this.reference = reference;
	}

	public String getTransactionTimestamp() {
		return transactionTimestamp;
	}

	public void setTransactionTimestamp(String transactionTimestamp) {
		this.transactionTimestamp = transactionTimestamp;
	}

	public String getTxnId() {
		return txnId;
	}

	public void setTxnId(String txnId) {
		this.txnId = txnId;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getValueDate() {
		return valueDate;
	}

	public void setValueDate(String valueDate) {
		this.valueDate = valueDate;
	}

	public String getBalance() {
		return balance;
	}

	public void setBalance(String balance) {
		this.balance = balance;
	}
}