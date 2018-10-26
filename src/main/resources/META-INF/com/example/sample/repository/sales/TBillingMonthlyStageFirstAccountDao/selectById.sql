select
  /*%expand*/*
from
  t_billing_monthly_stage_first_account
where
  account_id = /* accountId */1
  and
  stage_id = /* stageId */1
