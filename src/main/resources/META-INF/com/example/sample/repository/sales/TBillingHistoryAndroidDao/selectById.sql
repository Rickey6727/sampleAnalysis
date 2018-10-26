select
  /*%expand*/*
from
  t_billing_history_android
where
  account_id = /* accountId */1
  and
  purchase_token = /* purchaseToken */'a'
