select
  /*%expand*/*
from
  m_billing_monthly_stage
where
  billing_month = /* billingMonth */'a'
  and
  stage_id = /* stageId */1
