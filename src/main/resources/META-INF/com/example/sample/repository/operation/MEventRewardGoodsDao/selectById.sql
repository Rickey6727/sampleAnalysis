select
  /*%expand*/*
from
  m_event_reward_goods
where
  event_id = /* eventId */1
  and
  goods_group_id = /* goodsGroupId */1
  and
  goods_lot_no = /* goodsLotNo */1
