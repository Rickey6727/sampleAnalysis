select
  /*%expand*/*
from
  t_billing_android
where
  purchase_token = /* purchaseToken */'a'
