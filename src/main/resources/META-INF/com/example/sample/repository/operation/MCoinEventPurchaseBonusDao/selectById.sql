select
  /*%expand*/*
from
  m_coin_event_purchase_bonus
where
  event_id = /* eventId */1
  and
  product_id = /* productId */'a'
  and
  item_type = /* itemType */1
  and
  item_id = /* itemId */1
