select
  /*%expand*/*
from
  t_ccp_family_present_count
where
  application_id = /* applicationId */1
  and
  family_account_id = /* familyAccountId */1
