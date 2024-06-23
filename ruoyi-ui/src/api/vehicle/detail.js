import request from '@/utils/request'

// 查询物资明细列表
export function listDetail(query) {
  return request({
    url: '/system/detail/list',
    method: 'get',
    params: query
  })
}

// 查询物资明细详细
export function getDetail(materialId) {
  return request({
    url: '/system/detail/' + materialId,
    method: 'get'
  })
}

// 新增物资明细
export function addDetail(data) {
  return request({
    url: '/system/detail',
    method: 'post',
    data: data
  })
}

// 修改物资明细
export function updateDetail(data) {
  return request({
    url: '/system/detail',
    method: 'put',
    data: data
  })
}

// 删除物资明细
export function delDetail(materialId) {
  return request({
    url: '/system/detail/' + materialId,
    method: 'delete'
  })
}
