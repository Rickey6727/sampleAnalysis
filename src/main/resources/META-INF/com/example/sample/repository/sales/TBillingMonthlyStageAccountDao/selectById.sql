select
  /*%expand*/*
from
  t_billing_monthly_stage_account
where
  account_id = /* accountId */1
  and
  billing_month = /* billingMonth */'a'
  and
  stage_id = /* stageId */1
