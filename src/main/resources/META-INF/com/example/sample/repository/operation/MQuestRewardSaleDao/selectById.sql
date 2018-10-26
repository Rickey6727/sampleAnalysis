select
  /*%expand*/*
from
  m_quest_reward_sale
where
  quest_id = /* questId */1
  and
  shop_id = /* shopId */1
  and
  goods_id = /* goodsId */1
