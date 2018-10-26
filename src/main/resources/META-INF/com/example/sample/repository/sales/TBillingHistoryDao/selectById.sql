select
  /*%expand*/*
from
  t_billing_history
where
  account_id = /* accountId */1
  and
  transaction_id = /* transactionId */1
