import request from '@/utils/request'

// 查询制动阀列表
export function listValve(query) {
  return request({
    url: '/system/valve/list',
    method: 'get',
    params: query
  })
}

// 查询制动阀详细
export function getValve(brakeId) {
  return request({
    url: '/system/valve/' + brakeId,
    method: 'get'
  })
}

// 新增制动阀
export function addValve(data) {
  return request({
    url: '/system/valve',
    method: 'post',
    data: data
  })
}

// 修改制动阀
export function updateValve(data) {
  return request({
    url: '/system/valve',
    method: 'put',
    data: data
  })
}

// 删除制动阀
export function delValve(brakeId) {
  return request({
    url: '/system/valve/' + brakeId,
    method: 'delete'
  })
}
