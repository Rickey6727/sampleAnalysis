select
  /*%expand*/*
from
  m_banner_name_country
where
  banner_type = /* bannerType */1
  and
  type_id = /* typeId */1
  and
  country_cd = /* countryCd */1
  and
  display_order = /* displayOrder */1
