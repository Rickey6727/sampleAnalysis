select
  /*%expand*/*
from
  m_billing_monthly_stage_reward
where
  billing_month = /* billingMonth */'a'
  and
  stage_id = /* stageId */1
  and
  item_id = /* itemId */1
  and
  item_type = /* itemType */1
