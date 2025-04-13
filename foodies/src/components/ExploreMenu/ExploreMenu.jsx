import React from 'react'
import { categories } from '../../assets/assests'

const ExploreMenu = () => {
  return (
    <div className="explore-menu position-relative">
        <h1 className="d-flex aling-items-center justify-content-between">
            Explore Our Menu
        </h1>
        <div className="d-flex">
            <i className='bi bi-arrow-left-circle scroll-icon'></i>
            <i className='bi bi-arrow-right-circle scroll-icon'></i>
        </div>
    </div>
  )
}

export default ExploreMenu