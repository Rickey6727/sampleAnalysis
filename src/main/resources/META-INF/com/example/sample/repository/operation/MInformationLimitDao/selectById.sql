select
  /*%expand*/*
from
  m_information_limit
where
  limit_information_id = /* limitInformationId */1
  and
  account_id = /* accountId */1
