import request from '@/utils/request'

// 查询轴承退卸列表
export function listWithdrawal(query) {
  return request({
    url: '/system/withdrawal/list',
    method: 'get',
    params: query
  })
}

// 查询轴承退卸详细
export function getWithdrawal(bearingId) {
  return request({
    url: '/system/withdrawal/' + bearingId,
    method: 'get'
  })
}

// 新增轴承退卸
export function addWithdrawal(data) {
  return request({
    url: '/system/withdrawal',
    method: 'post',
    data: data
  })
}

// 修改轴承退卸
export function updateWithdrawal(data) {
  return request({
    url: '/system/withdrawal',
    method: 'put',
    data: data
  })
}

// 删除轴承退卸
export function delWithdrawal(bearingId) {
  return request({
    url: '/system/withdrawal/' + bearingId,
    method: 'delete'
  })
}
