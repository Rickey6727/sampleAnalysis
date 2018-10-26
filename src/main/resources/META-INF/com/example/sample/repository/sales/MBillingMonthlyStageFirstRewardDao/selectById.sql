select
  /*%expand*/*
from
  m_billing_monthly_stage_first_reward
where
  stage_id = /* stageId */1
  and
  item_id = /* itemId */1
  and
  item_type = /* itemType */1
