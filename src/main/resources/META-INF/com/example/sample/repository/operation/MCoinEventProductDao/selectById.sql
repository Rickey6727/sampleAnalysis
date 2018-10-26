select
  /*%expand*/*
from
  m_coin_event_product
where
  event_id = /* eventId */1
  and
  native_type = /* nativeType */1
  and
  product_id = /* productId */'a'
