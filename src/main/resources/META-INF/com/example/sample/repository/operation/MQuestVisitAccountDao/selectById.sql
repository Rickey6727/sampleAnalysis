select
  /*%expand*/*
from
  m_quest_visit_account
where
  quest_id = /* questId */1
  and
  account_id = /* accountId */1
