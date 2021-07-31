  CREATE TABLE public.transaction (id bigserial primary key, user_id bigint NOT NUll, account_id bigint NOT NULL,
  start_date character varying(255), end_date character varying(255), amount character varying(255), current_balance
  character varying(255), balance character varying(255), mode character varying(255), narration character varying(255),
  reference character varying(255), transaction_timestamp character varying(255), txn_id character varying(255), type
  character varying(255), value_date character varying(255), transaction_date_time character varying(255), amc character
  varying(255), registrar character varying(255), scheme_code character varying(255), scheme_plan character
  varying(255), scheme_types character varying(255), scheme_category character varying(255), isin character
  varying(255), amfi_code character varying(255), scheme_option character varying(255), fund_type character
  varying(255), ucc character varying(255), closing_units character varying(255), lien_units character varying(255), nav
  character varying(255), nav_date character varying(255), order_date character varying(255), execution_date character
  varying(255), lock_in_days character varying(255), lock_in_flag character varying(255), cost character varying(255),
  premium character varying(255), premium_allocation_charge character varying(255), other_charges character
  varying(255), units character varying(255), fund_name character varying(255), txn_date character varying(255),
  employee_deposit_amount character varying(255), employer_deposit_amount character varying(255),
  employee_withdrawal_amount character varying(255), employer_withdrawal_amount character varying(255),
  pension_fund_amount character varying(255), txn_type character varying(255), statement_date character varying(255),
  mcc character varying(255), masked_card_number character varying(255), issuer_name character varying(255), symbol
  character varying(255), exchange character varying(255), transaction_description character varying(255), price
  character varying(255), units_type character varying(255), num_units_transacted character varying(255), trade_value
  character varying(255), total_charge character varying(255), name_of_asset character varying(255),
  investment_date_time character varying(255), investment_value character varying(255), redemption_date character
  varying(255), redemption_value character varying(255), fund_fees_payment_date character varying(255),
  fund_fees_payment_amount character varying(255), re_investment_date character varying(255), re_investment_value
  character varying(255), payment_investor_date character varying(255), payment_investor_amount character varying(255),
  tax_paid_value character varying(255), tax_paid_date character varying(255), dividend_type character varying(255),
  order_id character varying(255), trade_id character varying(255), company_name character varying(255), rate character
  varying(255), share_holer_equity_type character varying(255), scheme_name character varying(255), dp_id character
  varying(255), scheme_min_lot_size character varying(255), face_valueof_units character varying(255), broker_code
  character varying(255), currency character varying(255), other_taxes character varying(255), equity_category character
  varying(255), instrument_type character varying(255), option_type character varying(255), strike_price character
  varying(255), share_holder_equity_type character varying(255), stt character varying(255), scheme character
  varying(255), folio_no character varying(255), first_level_category character varying(255), second_level_category
  character varying(255), third_level_category character varying(255), fourth_level_category character varying(255),
  transaction_number character varying(255), remark character varying(255), is_deleted boolean, created_at TIMESTAMP,
  updated_at TIMESTAMP, created_by bigint, updated_by bigint);