select
  /*%expand*/*
from
  m_limit_purchase_item
where
  limit_purchase_id = /* limitPurchaseId */1
  and
  item_no = /* itemNo */1
