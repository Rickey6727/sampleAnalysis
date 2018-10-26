select
  /*%expand*/*
from
  m_bonus_country
where
  bonus_id = /* bonusId */1
  and
  country_cd = /* countryCd */1
