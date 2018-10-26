select
  /*%expand*/*
from
  m_gacha_count_sale
where
  gacha_id = /* gachaId */1
  and
  gacha_count = /* gachaCount */1
  and
  gacha_kind = /* gachaKind */1
