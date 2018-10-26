select
  /*%expand*/*
from
  m_support_item_country
where
  support_item_id = /* supportItemId */1
  and
  country_cd = /* countryCd */1
