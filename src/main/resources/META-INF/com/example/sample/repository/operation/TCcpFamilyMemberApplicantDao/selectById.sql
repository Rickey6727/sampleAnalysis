select
  /*%expand*/*
from
  t_ccp_family_member_applicant
where
  application_id = /* applicationId */1
  and
  account_id = /* accountId */1
