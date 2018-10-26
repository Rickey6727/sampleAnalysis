select
  /*%expand*/*
from
  m_lottery
where
  lottery_id = /* lotteryId */1
  and
  gacha_id = /* gachaId */1
  and
  lottery_type = /* lotteryType */1
