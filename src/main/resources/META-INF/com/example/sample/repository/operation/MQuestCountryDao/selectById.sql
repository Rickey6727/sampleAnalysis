select
  /*%expand*/*
from
  m_quest_country
where
  quest_id = /* questId */1
  and
  country_cd = /* countryCd */1
