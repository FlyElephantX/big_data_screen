import request from '@/utils/request'

// 查询修车数列表
export function listRepair(query) {
  return request({
    url: '/system/repair/list',
    method: 'get',
    params: query
  })
}

// 查询修车数详细
export function getRepair(repairId) {
  return request({
    url: '/system/repair/' + repairId,
    method: 'get'
  })
}

// 新增修车数
export function addRepair(data) {
  return request({
    url: '/system/repair',
    method: 'post',
    data: data
  })
}

// 修改修车数
export function updateRepair(data) {
  return request({
    url: '/system/repair',
    method: 'put',
    data: data
  })
}

// 删除修车数
export function delRepair(repairId) {
  return request({
    url: '/system/repair/' + repairId,
    method: 'delete'
  })
}
