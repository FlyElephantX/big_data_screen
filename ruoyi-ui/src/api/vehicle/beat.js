import request from '@/utils/request'

// 查询节拍修兑现率列表
export function listRate(query) {
  return request({
    url: '/system/beat/list',
    method: 'get',
    params: query
  })
}

// 查询节拍修兑现率详细
export function getRate(repairId) {
  return request({
    url: '/system/beat/' + repairId,
    method: 'get'
  })
}

// 新增节拍修兑现率
export function addRate(data) {
  return request({
    url: '/system/beat',
    method: 'post',
    data: data
  })
}

// 修改节拍修兑现率
export function updateRate(data) {
  return request({
    url: '/system/beat',
    method: 'put',
    data: data
  })
}

// 删除节拍修兑现率
export function delRate(repairId) {
  return request({
    url: '/system/beat/' + repairId,
    method: 'delete'
  })
}
