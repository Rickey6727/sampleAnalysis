select
  /*%expand*/*
from
  m_npc_message
where
  npc_account_id = /* npcAccountId */1
  and
  country_cd = /* countryCd */1
  and
  town_rank = /* townRank */1
  and
  quest_id = /* questId */1
