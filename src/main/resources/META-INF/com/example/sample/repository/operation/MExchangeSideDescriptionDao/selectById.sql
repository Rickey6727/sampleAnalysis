select
  /*%expand*/*
from
  m_exchange_side_description
where
  exchange_id = /* exchangeId */1
  and
  country_cd = /* countryCd */1
