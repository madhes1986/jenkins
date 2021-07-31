package com.fego.transaction.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import com.fego.transaction.common.base.BaseModel;
import com.fego.transaction.common.constants.Constants;

@Entity
@Table(name = "transaction", schema = Constants.SCHEMA)
public class Transaction extends BaseModel{
	@Column(name = "user_id", nullable = false)
	private Long userId;
	@Column(name = "account_id", nullable = false)
	private Long accountId;
	@Column(name = "start_date")
	private String startDate;
	@Column(name = "end_date")
	private String endDate;
	private String amount;
	@Column(name = "current_balance")
	private String currentBalance;
	private String balance;
	private String mode;
	private String narration;
	private String reference;
	@Column(name = "transaction_timestamp")
	private String transactionTimestamp;
	@Column(name = "txn_id")
	private String txnId;
	private String type;
	@Column(name = "value_date")
	private String valueDate;
	@Column(name = "transaction_date_time")
	private String transactionDateTime;
	private String amc;
	private String registrar;
	@Column(name = "scheme_code")
	private String schemeCode;
	@Column(name = "scheme_plan")
	private String schemePlan;
	@Column(name = "scheme_types")
	private String schemeTypes;
	@Column(name = "scheme_category")
	private String schemeCategory;
	private String isin;
	@Column(name = "amfi_code")
	private String amfiCode;
	@Column(name = "scheme_option")
	private String schemeOption;
	@Column(name = "fund_type")
	private String fundType;
	private String ucc;
	@Column(name = "closing_units")
	private String closingUnits;
	@Column(name = "lien_units")
	private String lienUnits;
	private String nav;
	@Column(name = "nav_date")
	private String navDate;
	@Column(name = "order_date")
	private String orderDate;
	@Column(name = "execution_date")
	private String executionDate;
	@Column(name = "lock_in_days")
	private String lockInDays;
	@Column(name = "lock_in_flag")
	private String lockInFlag;
	private String cost;
	private String premium;
	@Column(name = "premium_allocation_charge")
	private String premiumAllocationCharge;
	@Column(name = "other_charges")
	private String otherCharges;
	private String units;
	@Column(name = "fund_name")
	private String fundName;
	@Column(name = "txn_date")
	private String txnDate;
	@Column(name = "employee_deposit_amount")
	private String employeeDepositAmount;
	@Column(name = "employer_deposit_amount")
	private String employerDepositAmount;
	@Column(name = "employee_withdrawal_amount")
	private String employeeWithdrawalAmount;
	@Column(name = "employer_withdrawal_amount")
	private String employerWithdrawalAmount;
	@Column(name = "pension_fund_amount")
	private String pensionFundAmount;
	@Column(name = "txn_type")
	private String txnType;
	@Column(name = "statement_date")
	private String statementDate;
	private String mcc;
	@Column(name = "masked_card_number")
	private String maskedCardNumber;
	@Column(name = "issuer_name")
	private String issuerName;
	private String symbol;
	private String exchange;
	@Column(name = "transaction_description")
	private String transactionDescription;
	private String price;
	@Column(name = "units_type")
	private String unitsType;
	@Column(name = "num_units_transacted")
	private String numUnitsTransacted;
	@Column(name = "trade_value")
	private String tradeValue;
	@Column(name = "total_charge")
	private String totalCharge;
	@Column(name = "name_of_asset")
	private String nameOfAsset;
	@Column(name = "investment_date_time")
	private String investmentDateTime;
	@Column(name = "investment_value")
	private String investmentValue;
	@Column(name = "redemption_date")
	private String redemptionDate;
	@Column(name = "redemption_value")
	private String redemptionValue;
	@Column(name = "fund_fees_payment_date")
	private String fundFeesPaymentDate;
	@Column(name = "fund_fees_payment_amount")
	private String fundFeesPaymentAmount;
	@Column(name = "re_investment_date")
	private String reInvestmentDate;
	@Column(name = "re_investment_value")
	private String reInvestmentValue;
	@Column(name = "payment_investor_date")
	private String paymentInvestorDate;
	@Column(name = "payment_investor_amount")
	private String paymentInvestorAmount;
	@Column(name = "tax_paid_value")
	private String taxPaidValue;
	@Column(name = "tax_paid_date")
	private String taxPaidDate;
	@Column(name = "dividend_type")
	private String dividendType;
	@Column(name = "order_id")
	private String orderId;
	@Column(name = "trade_id")
	private String tradeId;
	@Column(name = "company_name")
	private String companyName;
	private String rate;
	@Column(name = "scheme_name")
	private String schemeName;
	@Column(name = "dp_id")
	private String dpId;
	@Column(name = "scheme_min_lot_size")
	private String schemeMinLotSize;
	@Column(name = "face_valueof_units")
	private String faceValueofUnits;
	@Column(name = "broker_code")
	private String brokerCode;
	private String currency;
	@Column(name = "other_taxes")
	private String otherTaxes;
	@Column(name = "equity_category")
	private String equityCategory;
	@Column(name = "instrument_type")
	private String instrumentType;
	@Column(name = "option_type")
	private String optionType;
	@Column(name = "strike_price")
	private String strikePrice;
	@Column(name = "share_holder_equity_type")
	private String shareHolderEquityType;
	private String stt;
	private String scheme;
	@Column(name = "folio_no")
	private String folioNo;
	@Column(name = "first_level_category")
	private String firstLevelCategory;
	@Column(name = "second_level_category")
	private String secondLevelCategory;
	@Column(name = "third_level_category")
	private String thirdLevelCategory;
	@Column(name = "fourth_level_category")
	private String fourthLevelCategory;
	@Column(name = "remark")
	private String remark;
	@Column(name = "transaction_number")
	private String transactionNumber;

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public Long getAccountId() {
		return accountId;
	}

	public void setAccountId(Long accountId) {
		this.accountId = accountId;
	}

	public String getStartDate() {
		return startDate;
	}

	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}

	public String getEndDate() {
		return endDate;
	}

	public void setEndDate(String endDate) {
		this.endDate = endDate;
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

	public String getBalance() {
		return balance;
	}

	public void setBalance(String balance) {
		this.balance = balance;
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

	public String getTransactionDateTime() {
		return transactionDateTime;
	}

	public void setTransactionDateTime(String transactionDateTime) {
		this.transactionDateTime = transactionDateTime;
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

	public String getLockInDays() {
		return lockInDays;
	}

	public void setLockInDays(String lockInDays) {
		this.lockInDays = lockInDays;
	}

	public String getLockInFlag() {
		return lockInFlag;
	}

	public void setLockInFlag(String lockInFlag) {
		this.lockInFlag = lockInFlag;
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

	public String getNameOfAsset() {
		return nameOfAsset;
	}

	public void setNameOfAsset(String nameOfAsset) {
		this.nameOfAsset = nameOfAsset;
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

	public String getFirstLevelCategory() {
		return firstLevelCategory;
	}

	public void setFirstLevelCategory(String firstLevelCategory) {
		this.firstLevelCategory = firstLevelCategory;
	}

	public String getSecondLevelCategory() {
		return secondLevelCategory;
	}

	public void setSecondLevelCategory(String secondLevelCategory) {
		this.secondLevelCategory = secondLevelCategory;
	}

	public String getThirdLevelCategory() {
		return thirdLevelCategory;
	}

	public void setThirdLevelCategory(String thirdLevelCategory) {
		this.thirdLevelCategory = thirdLevelCategory;
	}

	public String getFourthLevelCategory() {
		return fourthLevelCategory;
	}

	public void setFourthLevelCategory(String fourthLevelCategory) {
		this.fourthLevelCategory = fourthLevelCategory;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public String getTransactionNumber() {
		return transactionNumber;
	}

	public void setTransactionNumber(String transactionNumber) {
		this.transactionNumber = transactionNumber;
	}
}