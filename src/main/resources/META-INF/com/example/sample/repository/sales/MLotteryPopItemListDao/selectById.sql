select
  /*%expand*/*
from
  m_lottery_pop_item_list
where
  lottery_term_id = /* lotteryTermId */1
  and
  pop_type = /* popType */1
  and
  clothes_id = /* clothesId */1
