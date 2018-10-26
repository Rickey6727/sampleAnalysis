select
  /*%expand*/*
from
  m_gacha_term_banner
where
  gacha_id = /* gachaId */1
  and
  country_cd = /* countryCd */1
  and
  term_no = /* termNo */1
