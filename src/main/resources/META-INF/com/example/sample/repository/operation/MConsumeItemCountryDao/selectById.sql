select
  /*%expand*/*
from
  m_consume_item_country
where
  item_id = /* itemId */1
  and
  country_cd = /* countryCd */1
