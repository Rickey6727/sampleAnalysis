select
  /*%expand*/*
from
  m_first_purchase_item
where
  first_purchase_id = /* firstPurchaseId */1
  and
  item_no = /* itemNo */1
