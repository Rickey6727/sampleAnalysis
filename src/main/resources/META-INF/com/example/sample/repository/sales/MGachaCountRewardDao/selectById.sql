select
  /*%expand*/*
from
  m_gacha_count_reward
where
  gacha_id = /* gachaId */1
  and
  gacha_count = /* gachaCount */1
