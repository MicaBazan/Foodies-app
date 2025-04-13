import React from 'react'
import { categories } from '../../assets/assests'

const ExploreMenu = () => {
  return (
    <div className="explore-menu position-relative">
        <h1 className="d-flex aling-items-center justify-content-between">
            Explore Our Menu
            <div className="d-flex">
                <i className='bi bi-arrow-left-circle scroll-icon'></i>
                <i className='bi bi-arrow-right-circle scroll-icon'></i>
            </div>
        </h1>
        <p>Explore curated list of dishes from top categories</p>
        <div className="d-flex justify-content-between gap-4 overflow-auto explore-menu-list">
          {
            categories.map((item, index) => {
              return (
                <div className="text-center explore-menu-list-item">
                  
                </div>
              )
            })
          }
        </div>
    </div>
  )
}

export default ExploreMenu