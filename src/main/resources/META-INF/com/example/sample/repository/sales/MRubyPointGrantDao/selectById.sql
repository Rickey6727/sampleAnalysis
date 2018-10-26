select
  /*%expand*/*
from
  m_ruby_point_grant
where
  gacha_id = /* gachaId */1
  and
  ruby_lot_grant_type = /* rubyLotGrantType */1
  and
  sub_id = /* subId */1
