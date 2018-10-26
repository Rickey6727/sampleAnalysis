select
  /*%expand*/*
from
  m_gacha_push
where
  gacha_push_typa = /* gachaPushTypa */1
  and
  country_cd = /* countryCd */1
